package p000a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: a.X0 */
/* loaded from: classes.dex */
public final class C1231X0 extends SQLiteOpenHelper {

    /* renamed from: y */
    public static final /* synthetic */ int f4000y = 0;

    /* renamed from: I */
    public final boolean f4001I;

    /* renamed from: R */
    public final C2196pM f4002R;

    /* renamed from: S */
    public final Context f4003S;

    /* renamed from: g */
    public boolean f4004g;

    /* renamed from: k */
    public final C0650MF f4005k;

    /* renamed from: q */
    public boolean f4006q;

    /* renamed from: w */
    public final AbstractC1796hn f4007w;

    public C1231X0(Context context, String str, final C2196pM c2196pM, final AbstractC1796hn abstractC1796hn) {
        super(context, str, null, abstractC1796hn.f5650z, new DatabaseErrorHandler() { // from class: a.iz
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                String mo1947od;
                int i = C1231X0.f4000y;
                C2196pM c2196pM2 = c2196pM;
                C0834PY c0834py = (C0834PY) c2196pM2.f6755R;
                if (c0834py == null || !AbstractC1292YB.m2695u(c0834py.f2820S, sQLiteDatabase)) {
                    c0834py = new C0834PY(sQLiteDatabase);
                    c2196pM2.f6755R = c0834py;
                }
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c0834py + ".path");
                boolean isOpen = c0834py.isOpen();
                AbstractC1796hn abstractC1796hn2 = AbstractC1796hn.this;
                if (!isOpen) {
                    mo1947od = c0834py.mo1947od();
                    if (mo1947od == null) {
                        return;
                    }
                } else {
                    List list = null;
                    try {
                        try {
                            list = c0834py.mo1949w();
                        } catch (Throwable th) {
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) ((Pair) it.next()).second;
                                    abstractC1796hn2.getClass();
                                    AbstractC1796hn.m3343z(str2);
                                }
                            } else {
                                String mo1947od2 = c0834py.mo1947od();
                                if (mo1947od2 != null) {
                                    abstractC1796hn2.getClass();
                                    AbstractC1796hn.m3343z(mo1947od2);
                                }
                            }
                            throw th;
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c0834py.close();
                    } catch (IOException unused2) {
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String str3 = (String) ((Pair) it2.next()).second;
                                abstractC1796hn2.getClass();
                                AbstractC1796hn.m3343z(str3);
                            }
                            return;
                        }
                        mo1947od = c0834py.mo1947od();
                        if (mo1947od == null) {
                            return;
                        }
                    }
                }
                abstractC1796hn2.getClass();
                AbstractC1796hn.m3343z(mo1947od);
            }
        });
        this.f4003S = context;
        this.f4002R = c2196pM;
        this.f4007w = abstractC1796hn;
        this.f4001I = false;
        this.f4005k = new C0650MF(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    /* renamed from: G */
    public final SQLiteDatabase m2530G(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f4004g;
        Context context = this.f4003S;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                return getWritableDatabase();
            }
            return getReadableDatabase();
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } catch (Throwable th) {
                super.close();
                if (th instanceof C0871QK) {
                    C0871QK c0871qk = th;
                    int m4204s = AbstractC2441tz.m4204s(c0871qk.f2960S);
                    Throwable th2 = c0871qk.f2959R;
                    if (m4204s != 0 && m4204s != 1 && m4204s != 2 && m4204s != 3) {
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                } else if (th instanceof SQLiteException) {
                    if (databaseName == null || !this.f4001I) {
                        throw th;
                    }
                } else {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        return getWritableDatabase();
                    }
                    return getReadableDatabase();
                } catch (C0871QK e) {
                    throw e.f2959R;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0650MF c0650mf = this.f4005k;
        try {
            c0650mf.m1456z(c0650mf.f2092z);
            super.close();
            this.f4002R.f6755R = null;
            this.f4004g = false;
        } finally {
            c0650mf.m1455h();
        }
    }

    /* renamed from: h */
    public final C0834PY m2531h(SQLiteDatabase sQLiteDatabase) {
        C2196pM c2196pM = this.f4002R;
        C0834PY c0834py = (C0834PY) c2196pM.f6755R;
        if (c0834py == null || !AbstractC1292YB.m2695u(c0834py.f2820S, sQLiteDatabase)) {
            C0834PY c0834py2 = new C0834PY(sQLiteDatabase);
            c2196pM.f6755R = c0834py2;
            return c0834py2;
        }
        return c0834py;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.f4006q;
        AbstractC1796hn abstractC1796hn = this.f4007w;
        if (!z && abstractC1796hn.f5650z != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            m2531h(sQLiteDatabase);
            abstractC1796hn.mo1187h();
        } catch (Throwable th) {
            throw new C0871QK(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f4007w.mo1189v(m2531h(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C0871QK(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4006q = true;
        try {
            this.f4007w.mo1185P(m2531h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C0871QK(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f4006q) {
            try {
                this.f4007w.mo1184N(m2531h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0871QK(5, th);
            }
        }
        this.f4004g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4006q = true;
        try {
            this.f4007w.mo1186Q(m2531h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C0871QK(3, th);
        }
    }

    /* renamed from: z */
    public final InterfaceC1136VG m2532z(boolean z) {
        C0650MF c0650mf = this.f4005k;
        try {
            c0650mf.m1456z((this.f4004g || getDatabaseName() == null) ? false : true);
            this.f4006q = false;
            SQLiteDatabase m2530G = m2530G(z);
            if (!this.f4006q) {
                return m2531h(m2530G);
            }
            close();
            return m2532z(z);
        } finally {
            c0650mf.m1455h();
        }
    }
}
