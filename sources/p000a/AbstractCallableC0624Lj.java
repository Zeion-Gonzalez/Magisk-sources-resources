package p000a;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: a.Lj */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0624Lj implements Callable {

    /* renamed from: R */
    public final List f2033R;

    /* renamed from: S */
    public final InputStream f2034S;

    public AbstractCallableC0624Lj(C0776OS c0776os, List list) {
        this.f2034S = c0776os;
        this.f2033R = list;
    }

    /* renamed from: z */
    public final String m1390z(boolean z) {
        boolean z2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f2034S, StandardCharsets.UTF_8));
        do {
            String readLine = bufferedReader.readLine();
            z2 = false;
            if (readLine != null) {
                int length = readLine.length();
                int i = length - 36;
                boolean startsWith = readLine.startsWith(C0434IE.f1417y, i);
                if (startsWith) {
                    if (length != 36) {
                        readLine = readLine.substring(0, i);
                    }
                }
                List list = this.f2033R;
                if (list != null) {
                    list.add(readLine);
                }
                z2 = !startsWith;
            }
        } while (z2);
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
