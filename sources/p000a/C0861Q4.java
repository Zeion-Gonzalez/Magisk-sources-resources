package p000a;

import java.io.IOException;

/* renamed from: a.Q4 */
/* loaded from: classes.dex */
public final class C0861Q4 extends RuntimeException {
    public C0861Q4() {
        super("Unable to init shell");
    }

    public C0861Q4(IOException iOException) {
        super("Unable to create a shell!", iOException);
    }
}
