package p000a;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: a.Zv */
/* loaded from: classes.dex */
public final class HandlerC1384Zv extends Handler {

    /* renamed from: z */
    public final WeakReference f4318z;

    public HandlerC1384Zv(DialogInterface dialogInterface) {
        this.f4318z = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f4318z.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
