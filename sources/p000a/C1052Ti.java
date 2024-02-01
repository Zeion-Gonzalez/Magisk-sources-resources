package p000a;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.Ti */
/* loaded from: classes.dex */
public final class C1052Ti extends C2056mk {

    /* renamed from: S */
    public final Socket f3476S;

    public C1052Ti(Socket socket) {
        this.f3476S = socket;
    }

    @Override // p000a.C2056mk
    /* renamed from: G */
    public final IOException mo2218G(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.C2056mk
    /* renamed from: M */
    public final void mo2219M() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        Socket socket = this.f3476S;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (AbstractC1292YB.m2656O(e)) {
                Logger logger2 = AbstractC0982SQ.f3316z;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                exc = e;
                logger = logger2;
                sb.append(socket);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
            throw e;
        } catch (Exception e2) {
            Logger logger3 = AbstractC0982SQ.f3316z;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            exc = e2;
            logger = logger3;
            sb.append(socket);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
