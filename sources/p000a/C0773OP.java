package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.OP */
/* loaded from: classes.dex */
public final class C0773OP implements Parcelable.Creator {

    /* renamed from: z */
    public final /* synthetic */ int f2633z;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2633z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0682Mu(parcel);
            case 1:
                return new C0885Qd(parcel);
            case 2:
                return new C2730zX(parcel);
            case 3:
                return new C0354Gn(parcel);
            default:
                return new C1017T4(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2633z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0682Mu[i];
            case 1:
                return new C0885Qd[i];
            case 2:
                return new C2730zX[i];
            case 3:
                return new C0354Gn[i];
            default:
                return new C1017T4[i];
        }
    }
}
