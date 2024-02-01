package p000a;

import android.view.Choreographer;
import androidx.databinding.AbstractC2760z;

/* renamed from: a.ND */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0700ND implements Choreographer.FrameCallback {

    /* renamed from: z */
    public final /* synthetic */ AbstractC2760z f2357z;

    public ChoreographerFrameCallbackC0700ND(AbstractC2760z abstractC2760z) {
        this.f2357z = abstractC2760z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f2357z.f8977R.run();
    }
}
