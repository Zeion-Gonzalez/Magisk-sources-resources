package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.T4 */
/* loaded from: classes.dex */
public final class C1017T4 implements Parcelable {
    public static final Parcelable.Creator<C1017T4> CREATOR = new C0773OP(4);

    /* renamed from: E */
    public final int f3397E;

    /* renamed from: I */
    public final int f3398I;

    /* renamed from: R */
    public final String f3399R;

    /* renamed from: S */
    public final String f3400S;

    /* renamed from: U */
    public final boolean f3401U;

    /* renamed from: Y */
    public final boolean f3402Y;

    /* renamed from: f */
    public final String f3403f;

    /* renamed from: g */
    public final boolean f3404g;

    /* renamed from: k */
    public final String f3405k;

    /* renamed from: q */
    public final int f3406q;

    /* renamed from: r */
    public final int f3407r;

    /* renamed from: s */
    public final boolean f3408s;

    /* renamed from: w */
    public final boolean f3409w;

    /* renamed from: y */
    public final boolean f3410y;

    public C1017T4(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        this.f3400S = abstractComponentCallbacksC2342s3.getClass().getName();
        this.f3399R = abstractComponentCallbacksC2342s3.f7218q;
        this.f3409w = abstractComponentCallbacksC2342s3.f7199Y;
        this.f3398I = abstractComponentCallbacksC2342s3.f7217p;
        this.f3406q = abstractComponentCallbacksC2342s3.f7209j;
        this.f3405k = abstractComponentCallbacksC2342s3.f7192L;
        this.f3404g = abstractComponentCallbacksC2342s3.f7193O;
        this.f3410y = abstractComponentCallbacksC2342s3.f7206f;
        this.f3408s = abstractComponentCallbacksC2342s3.f7204d;
        this.f3401U = abstractComponentCallbacksC2342s3.f7208i;
        this.f3397E = abstractComponentCallbacksC2342s3.f7215nP.ordinal();
        this.f3403f = abstractComponentCallbacksC2342s3.f7225y;
        this.f3407r = abstractComponentCallbacksC2342s3.f7221s;
        this.f3402Y = abstractComponentCallbacksC2342s3.f7191K;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final AbstractComponentCallbacksC2342s3 m2196h(C1448bA c1448bA) {
        AbstractComponentCallbacksC2342s3 m2868z = c1448bA.m2868z(this.f3400S);
        m2868z.f7218q = this.f3399R;
        m2868z.f7199Y = this.f3409w;
        m2868z.f7203c = true;
        m2868z.f7217p = this.f3398I;
        m2868z.f7209j = this.f3406q;
        m2868z.f7192L = this.f3405k;
        m2868z.f7193O = this.f3404g;
        m2868z.f7206f = this.f3410y;
        m2868z.f7204d = this.f3408s;
        m2868z.f7208i = this.f3401U;
        m2868z.f7215nP = ((EnumC1632eh[]) EnumC1632eh.f5090k.clone())[this.f3397E];
        m2868z.f7225y = this.f3403f;
        m2868z.f7221s = this.f3407r;
        m2868z.f7191K = this.f3402Y;
        return m2868z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3400S);
        sb.append(" (");
        sb.append(this.f3399R);
        sb.append(")}:");
        if (this.f3409w) {
            sb.append(" fromLayout");
        }
        int i = this.f3406q;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f3405k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f3404g) {
            sb.append(" retainInstance");
        }
        if (this.f3410y) {
            sb.append(" removing");
        }
        if (this.f3408s) {
            sb.append(" detached");
        }
        if (this.f3401U) {
            sb.append(" hidden");
        }
        String str2 = this.f3403f;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f3407r);
        }
        if (this.f3402Y) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3400S);
        parcel.writeString(this.f3399R);
        parcel.writeInt(this.f3409w ? 1 : 0);
        parcel.writeInt(this.f3398I);
        parcel.writeInt(this.f3406q);
        parcel.writeString(this.f3405k);
        parcel.writeInt(this.f3404g ? 1 : 0);
        parcel.writeInt(this.f3410y ? 1 : 0);
        parcel.writeInt(this.f3408s ? 1 : 0);
        parcel.writeInt(this.f3401U ? 1 : 0);
        parcel.writeInt(this.f3397E);
        parcel.writeString(this.f3403f);
        parcel.writeInt(this.f3407r);
        parcel.writeInt(this.f3402Y ? 1 : 0);
    }

    public C1017T4(Parcel parcel) {
        this.f3400S = parcel.readString();
        this.f3399R = parcel.readString();
        this.f3409w = parcel.readInt() != 0;
        this.f3398I = parcel.readInt();
        this.f3406q = parcel.readInt();
        this.f3405k = parcel.readString();
        this.f3404g = parcel.readInt() != 0;
        this.f3410y = parcel.readInt() != 0;
        this.f3408s = parcel.readInt() != 0;
        this.f3401U = parcel.readInt() != 0;
        this.f3397E = parcel.readInt();
        this.f3403f = parcel.readString();
        this.f3407r = parcel.readInt();
        this.f3402Y = parcel.readInt() != 0;
    }
}
