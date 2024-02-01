package p000a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.topjohnwu.magisk.core.model.MagiskJson;

/* renamed from: a.rm */
/* loaded from: classes.dex */
public final class C2327rm implements Parcelable.Creator {

    /* renamed from: z */
    public final /* synthetic */ int f7167z;

    public /* synthetic */ C2327rm(int i) {
        this.f7167z = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.f7167z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1440b0(parcel);
            case 1:
                return new C0244Ef((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                return new C1318Yi(parcel);
            case 3:
                return new C1679fY(parcel);
            case 4:
                return new C2185pA(parcel);
            case 5:
                return new C0359Gs(parcel);
            case 6:
                return new C0703NH(parcel);
            case 7:
                return new C2690ym(parcel);
            case 8:
                return new C0098Bv(parcel);
            case 9:
                return new ParcelImpl(parcel);
            case 10:
                return new C0053B2(parcel);
            case 11:
                return new C1053Tj(parcel);
            case 12:
                return new C2421tc((C0307Fr) parcel.readParcelable(C0307Fr.class.getClassLoader()), (C0307Fr) parcel.readParcelable(C0307Fr.class.getClassLoader()), (InterfaceC0899Qx) parcel.readParcelable(InterfaceC0899Qx.class.getClassLoader()), (C0307Fr) parcel.readParcelable(C0307Fr.class.getClassLoader()), parcel.readInt());
            case 13:
                return new C2143oQ(parcel.readLong());
            case 14:
                return C0307Fr.m651h(parcel.readInt(), parcel.readInt());
            case 15:
                return new C0988SY(parcel);
            case 16:
                return new C2286r3(parcel);
            case 17:
                return new C2642xo(MagiskJson.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 18:
                C0907R6 createFromParcel = C0907R6.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                EnumC0340GV enumC0340GV = EnumC0340GV.f1150S;
                return new C0012AD(createFromParcel, (EnumC0340GV) Enum.valueOf(EnumC0340GV.class, readString), parcel.readInt());
            case 19:
                return new MagiskJson(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 20:
                return new C0907R6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 21:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new C0962S2(readInt, readInt2, z, z2, z3);
            case 22:
                parcel.readInt();
                return new C1082UG();
            case 23:
                parcel.readInt();
                return new C2103nd();
            case 24:
                return new C0427I5(parcel);
            case 25:
                return new C0676Mn(parcel);
            default:
                return new C0365Gy(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7167z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1440b0[i];
            case 1:
                return new C0244Ef[i];
            case 2:
                return new C1318Yi[i];
            case 3:
                return new C1679fY[i];
            case 4:
                return new C2185pA[i];
            case 5:
                return new C0359Gs[i];
            case 6:
                return new C0703NH[i];
            case 7:
                return new C2690ym[i];
            case 8:
                return new C0098Bv[i];
            case 9:
                return new ParcelImpl[i];
            case 10:
                return new C0053B2[i];
            case 11:
                return new C1053Tj[i];
            case 12:
                return new C2421tc[i];
            case 13:
                return new C2143oQ[i];
            case 14:
                return new C0307Fr[i];
            case 15:
                return new C0988SY[i];
            case 16:
                return new C2286r3[i];
            case 17:
                return new C2642xo[i];
            case 18:
                return new C0012AD[i];
            case 19:
                return new MagiskJson[i];
            case 20:
                return new C0907R6[i];
            case 21:
                return new C0962S2[i];
            case 22:
                return new C1082UG[i];
            case 23:
                return new C2103nd[i];
            case 24:
                return new C0427I5[i];
            case 25:
                return new C0676Mn[i];
            default:
                return new C0365Gy[i];
        }
    }
}
