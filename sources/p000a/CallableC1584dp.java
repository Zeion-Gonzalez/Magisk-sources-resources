package p000a;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* renamed from: a.dp */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1584dp implements Callable {

    /* renamed from: R */
    public final /* synthetic */ Closeable f4872R;

    /* renamed from: S */
    public final /* synthetic */ int f4873S;

    public /* synthetic */ CallableC1584dp(Closeable closeable, int i) {
        this.f4873S = i;
        this.f4872R = closeable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f4873S;
        Closeable closeable = this.f4872R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C0434IE) closeable).m972d3();
            default:
                C1996lX c1996lX = (C1996lX) closeable;
                C0529Jz c0529Jz = c1996lX.f6181k;
                try {
                    c1996lX.f6182q.exitValue();
                    throw new IOException("Created process has terminated");
                } catch (IllegalThreadStateException unused) {
                    C0776OS c0776os = c1996lX.f6180g;
                    AbstractC1292YB.m2660S(c0776os);
                    AbstractC1292YB.m2660S(c1996lX.f6184y);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0776os));
                    try {
                        c0529Jz.write("echo SHELL_TEST\n".getBytes(StandardCharsets.UTF_8));
                        c0529Jz.flush();
                        String readLine = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(readLine) && readLine.contains("SHELL_TEST")) {
                            c0529Jz.write("id\n".getBytes(StandardCharsets.UTF_8));
                            c0529Jz.flush();
                            String readLine2 = bufferedReader.readLine();
                            int i2 = 0;
                            if (!TextUtils.isEmpty(readLine2) && readLine2.contains("uid=0")) {
                                synchronized (AbstractC1292YB.class) {
                                    AbstractC1292YB.f4141h = 2;
                                    String property = System.getProperty("user.dir");
                                    StringBuilder sb = new StringBuilder("'");
                                    int length = property.length();
                                    while (i2 < length) {
                                        char charAt = property.charAt(i2);
                                        if (charAt == '\'') {
                                            sb.append("'\\''");
                                        } else {
                                            sb.append(charAt);
                                        }
                                        i2++;
                                    }
                                    sb.append('\'');
                                    c0529Jz.write(("cd " + sb.toString() + "\n").getBytes(StandardCharsets.UTF_8));
                                    c0529Jz.flush();
                                    i2 = 1;
                                }
                            }
                            bufferedReader.close();
                            return Integer.valueOf(i2);
                        }
                        throw new IOException("Created process is not a shell");
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
        }
    }
}
