package p000a;

import android.view.ViewGroup;

/* renamed from: a.gO */
/* loaded from: classes.dex */
public final class C1721gO extends AbstractC1720gN {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721gO(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, ViewGroup viewGroup, int i) {
        super(abstractComponentCallbacksC2342s3, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC2342s3 + " to container " + viewGroup);
        if (i != 1) {
            return;
        }
        super(abstractComponentCallbacksC2342s3, "Attempting to add fragment " + abstractComponentCallbacksC2342s3 + " to container " + viewGroup + " which is not a FragmentContainerView");
    }

    public C1721gO(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, String str) {
        super(abstractComponentCallbacksC2342s3, "Attempting to reuse fragment " + abstractComponentCallbacksC2342s3 + " with previous ID " + str);
    }
}
