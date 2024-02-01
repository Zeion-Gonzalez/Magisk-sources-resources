package p000a;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* renamed from: a.hn */
/* loaded from: classes.dex */
public abstract class AbstractC1796hn {

    /* renamed from: z */
    public final int f5650z;

    /* renamed from: z */
    public static void m3343z(String str) {
        int i;
        boolean z;
        if (!AbstractC1269Xn.m2594yF(str, ":memory:")) {
            boolean z2 = true;
            int length = str.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                if (!z3) {
                    i = i2;
                } else {
                    i = length;
                }
                if (AbstractC1292YB.m2696w(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z3) {
                    if (!z) {
                        z3 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                z2 = false;
            }
            if (!z2) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    /* renamed from: N */
    public abstract void mo1184N(C0834PY c0834py);

    /* renamed from: P */
    public abstract void mo1185P(C0834PY c0834py, int i, int i2);

    /* renamed from: Q */
    public abstract void mo1186Q(C0834PY c0834py, int i, int i2);

    /* renamed from: h */
    public abstract void mo1187h();

    /* renamed from: v */
    public abstract void mo1189v(C0834PY c0834py);
}
