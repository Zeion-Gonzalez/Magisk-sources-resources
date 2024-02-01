package p000a;

import android.database.sqlite.SQLiteProgram;
import java.util.List;

/* renamed from: a.w5 */
/* loaded from: classes.dex */
public class C2554w5 implements InterfaceC1622eX {

    /* renamed from: R */
    public final Object f7800R;

    /* renamed from: S */
    public final /* synthetic */ int f7801S = 1;

    public C2554w5(SQLiteProgram sQLiteProgram) {
        this.f7800R = sQLiteProgram;
    }

    /* renamed from: G */
    public final void m4372G(int i, Object obj) {
        int size;
        int i2 = i - 1;
        Object obj2 = this.f7800R;
        if (i2 >= ((List) obj2).size() && (size = ((List) obj2).size()) <= i2) {
            while (true) {
                ((List) obj2).add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        ((List) obj2).set(i2, obj);
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: T */
    public final void mo2990T(int i) {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4372G(i, null);
                return;
            default:
                ((SQLiteProgram) this.f7800R).bindNull(i);
                return;
        }
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: Y */
    public final void mo2991Y(int i, long j) {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4372G(i, Long.valueOf(j));
                return;
            default:
                ((SQLiteProgram) this.f7800R).bindLong(i, j);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return;
            default:
                ((SQLiteProgram) this.f7800R).close();
                return;
        }
    }

    @Override // p000a.InterfaceC1622eX
    /* renamed from: f */
    public final void mo2992f(int i, String str) {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4372G(i, str);
                return;
            default:
                ((SQLiteProgram) this.f7800R).bindString(i, str);
                return;
        }
    }

    /* renamed from: h */
    public final void m4373h(int i, double d) {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4372G(i, Double.valueOf(d));
                return;
            default:
                ((SQLiteProgram) this.f7800R).bindDouble(i, d);
                return;
        }
    }

    /* renamed from: z */
    public final void m4374z(int i, byte[] bArr) {
        switch (this.f7801S) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4372G(i, bArr);
                return;
            default:
                ((SQLiteProgram) this.f7800R).bindBlob(i, bArr);
                return;
        }
    }
}
