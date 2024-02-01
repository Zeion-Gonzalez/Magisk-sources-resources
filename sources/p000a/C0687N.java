package p000a;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: a.N */
/* loaded from: classes.dex */
public final class C0687N extends FilterOutputStream {

    /* renamed from: R */
    public final /* synthetic */ PendingIntent f2262R;

    /* renamed from: S */
    public final /* synthetic */ PackageInstaller.Session f2263S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687N(OutputStream outputStream, PackageInstaller.Session session, PendingIntent pendingIntent) {
        super(outputStream);
        this.f2263S = session;
        this.f2262R = pendingIntent;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        IntentSender intentSender = this.f2262R.getIntentSender();
        PackageInstaller.Session session = this.f2263S;
        session.commit(intentSender);
        session.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
