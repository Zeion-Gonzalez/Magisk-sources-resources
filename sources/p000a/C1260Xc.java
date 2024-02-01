package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.Xc */
/* loaded from: classes.dex */
public final class C1260Xc implements Parcelable.ClassLoaderCreator {

    /* renamed from: z */
    public final /* synthetic */ int f4082z;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4082z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C2227pz(parcel, null);
            case 1:
                return new C2457uJ(parcel, null);
            case 2:
                return new C2490uw(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2602x.f8020R;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C2700yz(parcel, null);
            case 5:
                return new C2243qH(parcel, (ClassLoader) null);
            case 6:
                return new C2408tN(parcel, null);
            case 7:
                return new C2142oP(parcel, null);
            case 8:
                return new C0387HM(parcel, null);
            case 9:
                return new C2576wX(parcel, null);
            case 10:
                return new C2590wo(parcel, (ClassLoader) null);
            case 11:
                return new C2290r8(parcel, null);
            default:
                return new C2308rR(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4082z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C2227pz[i];
            case 1:
                return new C2457uJ[i];
            case 2:
                return new C2490uw[i];
            case 3:
                return new AbstractC2602x[i];
            case 4:
                return new C2700yz[i];
            case 5:
                return new C2243qH[i];
            case 6:
                return new C2408tN[i];
            case 7:
                return new C2142oP[i];
            case 8:
                return new C0387HM[i];
            case 9:
                return new C2576wX[i];
            case 10:
                return new C2590wo[i];
            case 11:
                return new C2290r8[i];
            default:
                return new C2308rR[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f4082z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C2227pz(parcel, classLoader);
            case 1:
                return new C2457uJ(parcel, classLoader);
            case 2:
                return new C2490uw(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2602x.f8020R;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C2700yz(parcel, classLoader);
            case 5:
                return new C2243qH(parcel, classLoader);
            case 6:
                return new C2408tN(parcel, classLoader);
            case 7:
                return new C2142oP(parcel, classLoader);
            case 8:
                return new C0387HM(parcel, classLoader);
            case 9:
                return new C2576wX(parcel, classLoader);
            case 10:
                return new C2590wo(parcel, classLoader);
            case 11:
                return new C2290r8(parcel, classLoader);
            default:
                return new C2308rR(parcel, classLoader);
        }
    }
}
