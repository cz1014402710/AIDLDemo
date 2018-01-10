package com.chenz.ailddemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * description: <一句话功能简述>
 *
 * @author Chenz
 * @date 2017/12/29
 */
public class QueryNameService extends Service {

    private String[] names = {"张三", "李四", "王五"};

    private QueryNameBinder mBinder;

    @Override
    public void onCreate() {
        super.onCreate();
        mBinder = new QueryNameBinder();
    }

    private String query(int id) {
        if (id > 0 && id < 4) {
            return names[id];
        }
        return "查无此人";
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public class QueryNameBinder extends IQueryName.Stub {

        @Override
        public String queryName(int id) throws RemoteException {
            return query(id);
        }
    }
}
