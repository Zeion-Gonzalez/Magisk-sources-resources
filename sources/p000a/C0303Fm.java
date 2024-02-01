package p000a;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: a.Fm */
/* loaded from: classes.dex */
public final class C0303Fm extends Handler {

    /* renamed from: z */
    public static final C0303Fm f1047z = new C0303Fm();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int min;
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC0301Fk.f1043z;
        String loggerName = logRecord.getLoggerName();
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = (String) AbstractC0301Fk.f1042h.get(loggerName);
        if (str == null) {
            str = AbstractC1779hS.m3307Ux(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int m2572Fu = AbstractC1269Xn.m2572Fu(message, '\n', i2, false, 4);
                if (m2572Fu == -1) {
                    m2572Fu = length;
                }
                while (true) {
                    min = Math.min(m2572Fu, i2 + 4000);
                    Log.println(i, str, message.substring(i2, min));
                    if (min >= m2572Fu) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }
}
