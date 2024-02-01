package p000a;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.SZ */
/* loaded from: classes.dex */
public final class C0989SZ extends Writer {

    /* renamed from: R */
    public final StringBuilder f3332R = new StringBuilder(128);

    /* renamed from: S */
    public final String f3333S = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2163z();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m2163z();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2163z();
            } else {
                this.f3332R.append(c);
            }
        }
    }

    /* renamed from: z */
    public final void m2163z() {
        StringBuilder sb = this.f3332R;
        if (sb.length() > 0) {
            Log.d(this.f3333S, sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
