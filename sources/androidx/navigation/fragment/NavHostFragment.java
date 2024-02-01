package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.topjohnwu.magisk.R;
import p000a.AbstractC0873QM;
import p000a.AbstractC1173Vx;
import p000a.AbstractC1295YE;
import p000a.AbstractC2499v4;
import p000a.AbstractComponentCallbacksC2342s3;
import p000a.C0366Gz;
import p000a.C0398HY;
import p000a.C0741Nu;
import p000a.C0923RN;
import p000a.C1146VR;
import p000a.C1407aQ;
import p000a.C1831iT;
import p000a.C1980lF;
import p000a.C2211pf;

/* loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC2342s3 {

    /* renamed from: BO */
    public boolean f9027BO;

    /* renamed from: EC */
    public View f9028EC;

    /* renamed from: U8 */
    public int f9029U8;

    /* renamed from: n0 */
    public final C1146VR f9030n0 = new C1146VR(new C1407aQ(2, this));

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public final void mo279F(Bundle bundle) {
        if (this.f9027BO) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: J */
    public final void mo281J() {
        Object next;
        this.f7224x = true;
        View view = this.f9028EC;
        if (view != null) {
            C0923RN c0923rn = new C0923RN(new C2211pf(new C1831iT(AbstractC0873QM.m2010BX(view, C1980lF.f6126J), C1980lF.f6132c, 2), false, C0741Nu.f2537i));
            if (!c0923rn.hasNext()) {
                next = null;
            } else {
                next = c0923rn.next();
            }
            AbstractC2499v4 abstractC2499v4 = (AbstractC2499v4) next;
            if (abstractC2499v4 != null) {
                if (abstractC2499v4 == ((C0366Gz) this.f9030n0.getValue())) {
                    view.setTag(R.id.nav_controller_view_tag, null);
                }
            } else {
                throw new IllegalStateException("View " + view + " does not have a NavController set");
            }
        }
        this.f9028EC = null;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i = this.f7217p;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: e */
    public final void mo4010e(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.mo4010e(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1295YE.f4148h);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f9029U8 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1173Vx.f3824v);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f9027BO = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: f */
    public final void mo287f(Context context) {
        super.mo287f(context);
        if (this.f9027BO) {
            C0398HY c0398hy = new C0398HY(m4005R());
            c0398hy.m895u(this);
            c0398hy.m892P(false);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public final void mo3517j(View view, Bundle bundle) {
        if (view instanceof ViewGroup) {
            C1146VR c1146vr = this.f9030n0;
            view.setTag(R.id.nav_controller_view_tag, (C0366Gz) c1146vr.getValue());
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f9028EC = view2;
                if (view2.getId() == this.f7217p) {
                    this.f9028EC.setTag(R.id.nav_controller_view_tag, (C0366Gz) c1146vr.getValue());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public final void mo290r(Bundle bundle) {
        C0366Gz c0366Gz = (C0366Gz) this.f9030n0.getValue();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f9027BO = true;
            C0398HY c0398hy = new C0398HY(m4005R());
            c0398hy.m895u(this);
            c0398hy.m892P(false);
        }
        super.mo290r(bundle);
    }
}
