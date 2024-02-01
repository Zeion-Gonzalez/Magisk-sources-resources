package p000a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: a.K0 */
/* loaded from: classes.dex */
public abstract class AbstractC0531K0 {

    /* renamed from: z */
    public final ThreadLocal f1774z = new ThreadLocal();

    /* renamed from: N */
    public abstract void mo1156N(int i, String str, String str2, Throwable th);

    /* renamed from: P */
    public /* synthetic */ String mo1245P() {
        ThreadLocal threadLocal = this.f1774z;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
        }
        return str;
    }

    /* renamed from: Q */
    public final void m1246Q(int i, Throwable th, String str, Object... objArr) {
        boolean z;
        boolean z2;
        String mo1245P = mo1245P();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (th == null) {
                return;
            }
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            str = stringWriter.toString();
        } else {
            if (objArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (true ^ z2) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            }
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) str);
                sb.append('\n');
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                sb.append(stringWriter2.toString());
                str = sb.toString();
            }
        }
        mo1156N(i, mo1245P, str, th);
    }

    /* renamed from: h */
    public void mo1157h(String str, Object... objArr) {
        m1246Q(6, null, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: u */
    public void mo1159u(Exception exc) {
        m1246Q(5, exc, null, new Object[0]);
    }

    /* renamed from: v */
    public void mo1160v(Throwable th) {
        m1246Q(6, th, null, new Object[0]);
    }

    /* renamed from: z */
    public void mo1161z(Object... objArr) {
        m1246Q(3, null, "onServiceConnected", Arrays.copyOf(objArr, objArr.length));
    }
}
