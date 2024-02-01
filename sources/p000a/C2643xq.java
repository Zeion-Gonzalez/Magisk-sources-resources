package p000a;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: a.xq */
/* loaded from: classes.dex */
public final class C2643xq extends AbstractC0686Mz implements InterfaceC1428ao {

    /* renamed from: I */
    public final AbstractC0783OZ f8240I;

    /* renamed from: R */
    public final C0462Ik f8241R;

    /* renamed from: S */
    public final Application f8242S;

    /* renamed from: q */
    public final C1934kN f8243q;

    /* renamed from: w */
    public final Bundle f8244w;

    public C2643xq(Application application, C1553dE c1553dE, Bundle bundle) {
        C0462Ik c0462Ik;
        this.f8243q = c1553dE.f4796s.f4218h;
        this.f8240I = c1553dE.f4798y;
        this.f8244w = bundle;
        this.f8242S = application;
        if (application != null) {
            if (C0462Ik.f1555I == null) {
                C0462Ik.f1555I = new C0462Ik(application);
            }
            c0462Ik = C0462Ik.f1555I;
        } else {
            c0462Ik = new C0462Ik(null);
        }
        this.f8241R = c0462Ik;
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: N */
    public final AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        List list;
        String str = (String) c0945Rm.m2111z(C1710g8.f5379U);
        if (str != null) {
            if (c0945Rm.m2111z(AbstractC1843ih.f5745I) != null && c0945Rm.m2111z(AbstractC1843ih.f5757q) != null) {
                Application application = (Application) c0945Rm.m2111z(C1710g8.f5383s);
                boolean isAssignableFrom = AbstractC2552w1.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = AbstractC0179DT.f550z;
                } else {
                    list = AbstractC0179DT.f549h;
                }
                Constructor m350z = AbstractC0179DT.m350z(cls, list);
                if (m350z == null) {
                    return this.f8241R.mo1121N(cls, c0945Rm);
                }
                if (isAssignableFrom && application != null) {
                    return AbstractC0179DT.m349h(cls, m350z, application, AbstractC1843ih.m3443g(c0945Rm));
                }
                return AbstractC0179DT.m349h(cls, m350z, AbstractC1843ih.m3443g(c0945Rm));
            }
            if (this.f8240I != null) {
                return m4544v(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // p000a.AbstractC0686Mz
    /* renamed from: h */
    public final void mo1604h(AbstractC1952kk abstractC1952kk) {
        AbstractC0783OZ abstractC0783OZ = this.f8240I;
        if (abstractC0783OZ != null) {
            AbstractC1843ih.m3418N(abstractC1952kk, this.f8243q, abstractC0783OZ);
        }
    }

    /* renamed from: v */
    public final AbstractC1952kk m4544v(Class cls, String str) {
        List list;
        AbstractC1952kk m349h;
        AbstractC0783OZ abstractC0783OZ = this.f8240I;
        if (abstractC0783OZ != null) {
            boolean isAssignableFrom = AbstractC2552w1.class.isAssignableFrom(cls);
            Application application = this.f8242S;
            if (isAssignableFrom && application != null) {
                list = AbstractC0179DT.f550z;
            } else {
                list = AbstractC0179DT.f549h;
            }
            Constructor m350z = AbstractC0179DT.m350z(cls, list);
            if (m350z == null) {
                if (application != null) {
                    return this.f8241R.mo1123z(cls);
                }
                if (C2567wM.f7845R == null) {
                    C2567wM.f7845R = new C2567wM();
                }
                return C2567wM.f7845R.mo1123z(cls);
            }
            C1934kN c1934kN = this.f8243q;
            Bundle m3555z = c1934kN.m3555z(str);
            Class[] clsArr = C0827PQ.f2805Q;
            C0827PQ m3151o = C1665fK.m3151o(m3555z, this.f8244w);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, m3151o);
            savedStateHandleController.m4841o(abstractC0783OZ, c1934kN);
            AbstractC1843ih.m3438d3(abstractC0783OZ, c1934kN);
            if (isAssignableFrom && application != null) {
                m349h = AbstractC0179DT.m349h(cls, m350z, application, m3151o);
            } else {
                m349h = AbstractC0179DT.m349h(cls, m350z, m3151o);
            }
            m349h.m3574u("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
            return m349h;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: z */
    public final AbstractC1952kk mo1123z(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m4544v(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
