package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.R6 */
/* loaded from: classes.dex */
public final class C0907R6 extends AbstractC0260Ez implements Parcelable {
    public static final Parcelable.Creator<C0907R6> CREATOR = new C2327rm(20);

    /* renamed from: I */
    public final int f3108I;

    /* renamed from: R */
    public final String f3109R;

    /* renamed from: S */
    public final String f3110S;

    /* renamed from: k */
    public final String f3111k;

    /* renamed from: q */
    public final String f3112q;

    /* renamed from: w */
    public final String f3113w;

    public C0907R6(String str, String str2, String str3, int i, String str4, String str5) {
        this.f3110S = str;
        this.f3109R = str2;
        this.f3113w = str3;
        this.f3108I = i;
        this.f3112q = str4;
        this.f3111k = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0907R6)) {
            return false;
        }
        C0907R6 c0907r6 = (C0907R6) obj;
        return AbstractC1292YB.m2695u(this.f3110S, c0907r6.f3110S) && AbstractC1292YB.m2695u(this.f3109R, c0907r6.f3109R) && AbstractC1292YB.m2695u(this.f3113w, c0907r6.f3113w) && this.f3108I == c0907r6.f3108I && AbstractC1292YB.m2695u(this.f3112q, c0907r6.f3112q) && AbstractC1292YB.m2695u(this.f3111k, c0907r6.f3111k);
    }

    @Override // p000a.AbstractC0260Ez
    /* renamed from: h */
    public final String mo558h() {
        return this.f3110S;
    }

    public final int hashCode() {
        return this.f3111k.hashCode() + ((this.f3112q.hashCode() + ((((this.f3113w.hashCode() + ((this.f3109R.hashCode() + (this.f3110S.hashCode() * 31)) * 31)) * 31) + this.f3108I) * 31)) * 31);
    }

    public final String toString() {
        return "OnlineModule(id=" + this.f3110S + ", name=" + this.f3109R + ", version=" + this.f3113w + ", versionCode=" + this.f3108I + ", zipUrl=" + this.f3112q + ", changelog=" + this.f3111k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3110S);
        parcel.writeString(this.f3109R);
        parcel.writeString(this.f3113w);
        parcel.writeInt(this.f3108I);
        parcel.writeString(this.f3112q);
        parcel.writeString(this.f3111k);
    }
}
