package p000a;

import android.os.FileObserver;
import java.io.File;

/* renamed from: a.YY */
/* loaded from: classes.dex */
public final class FileObserverC1311YY extends FileObserver {

    /* renamed from: h */
    public final /* synthetic */ BinderC2198pP f4172h;

    /* renamed from: z */
    public final String f4173z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC1311YY(BinderC2198pP binderC2198pP, File file) {
        super(file.getParent(), 1984);
        this.f4172h = binderC2198pP;
        file.getParent();
        this.f4173z = file.getName();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 1024 || this.f4173z.equals(str)) {
            this.f4172h.getClass();
            System.exit(0);
        }
    }
}
