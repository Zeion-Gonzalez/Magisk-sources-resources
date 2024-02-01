package p000a;

import android.view.View;

/* renamed from: a.SG */
/* loaded from: classes.dex */
public final class C0973SG extends AbstractC2703z2 {

    /* renamed from: R */
    public final /* synthetic */ AbstractComponentCallbacksC2342s3 f3289R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0973SG(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        super(3);
        this.f3289R = abstractComponentCallbacksC2342s3;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: BX */
    public final boolean mo1965BX() {
        return this.f3289R.f7222t != null;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Ha */
    public final View mo1968Ha(int i) {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f3289R;
        View view = abstractComponentCallbacksC2342s3.f7222t;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2342s3 + " does not have a view");
    }
}
