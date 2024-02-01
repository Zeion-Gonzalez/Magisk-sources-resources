package p000a;

import android.app.job.JobParameters;
import com.topjohnwu.magisk.core.JobService;

/* renamed from: a.r0 */
/* loaded from: classes.dex */
public final class C2283r0 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ JobParameters f7038g;

    /* renamed from: k */
    public final /* synthetic */ JobService f7039k;

    /* renamed from: q */
    public int f7040q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2283r0(JobService jobService, JobParameters jobParameters, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7039k = jobService;
        this.f7038g = jobParameters;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2283r0(this.f7039k, this.f7038g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7040q;
        JobService jobService = this.f7039k;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            this.f7040q = 1;
            if (JobService.m5125z(jobService, this) == enumC0464Im) {
                return enumC0464Im;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        }
        jobService.jobFinished(this.f7038g, false);
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2283r0) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
