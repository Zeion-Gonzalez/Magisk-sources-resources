package p000a;

import com.topjohnwu.magisk.core.JobService;

/* renamed from: a.pX */
/* loaded from: classes.dex */
public final class C2205pX extends AbstractC0620Lf {

    /* renamed from: I */
    public /* synthetic */ Object f6776I;

    /* renamed from: k */
    public int f6777k;

    /* renamed from: q */
    public final /* synthetic */ JobService f6778q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2205pX(JobService jobService, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6778q = jobService;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        this.f6776I = obj;
        this.f6777k |= Integer.MIN_VALUE;
        return JobService.m5125z(this.f6778q, this);
    }
}
