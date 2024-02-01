package p000a;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import java.io.IOException;

/* renamed from: a.NY */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0720NY implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ C2654y3 f2418R;

    /* renamed from: S */
    public final /* synthetic */ int f2419S;

    /* renamed from: w */
    public final /* synthetic */ ParcelFileDescriptor f2420w;

    public /* synthetic */ RunnableC0720NY(C2654y3 c2654y3, ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.f2419S = i;
        this.f2418R = c2654y3;
        this.f2420w = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2419S;
        ParcelFileDescriptor parcelFileDescriptor = this.f2420w;
        C2654y3 c2654y3 = this.f2418R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    try {
                        c2654y3.f8270R = AbstractC1244XD.m2552h(parcelFileDescriptor.detachFd());
                        do {
                        } while (c2654y3.m4559h(65536, -1L, false) > 0);
                        c2654y3.close();
                        return;
                    } catch (ErrnoException | IOException unused) {
                        return;
                    }
                } finally {
                }
            default:
                try {
                    try {
                        c2654y3.f8273w = AbstractC1244XD.m2552h(parcelFileDescriptor.detachFd());
                        do {
                        } while (c2654y3.m4560z(65536, -1L) > 0);
                        c2654y3.close();
                        return;
                    } finally {
                    }
                } catch (ErrnoException | IOException unused2) {
                    return;
                }
        }
    }
}
