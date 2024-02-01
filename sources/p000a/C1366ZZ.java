package p000a;

/* renamed from: a.ZZ */
/* loaded from: classes.dex */
public final class C1366ZZ extends AbstractC0231EP implements InterfaceC2030mD {

    /* renamed from: z */
    public final /* synthetic */ int f4284z;

    public /* synthetic */ C1366ZZ(int i) {
        this.f4284z = i;
    }

    @Override // p000a.InterfaceC2030mD
    /* renamed from: h */
    public final void mo557h(AbstractActivityC0819PG abstractActivityC0819PG) {
        switch (this.f4284z) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractActivityC0819PG.onBackPressed();
                return;
            case 1:
                abstractActivityC0819PG.finish();
                return;
            case 2:
                abstractActivityC0819PG.recreate();
                return;
            default:
                return;
        }
    }
}
