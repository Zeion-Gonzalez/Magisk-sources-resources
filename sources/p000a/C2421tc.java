package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* renamed from: a.tc */
/* loaded from: classes.dex */
public final class C2421tc implements Parcelable {
    public static final Parcelable.Creator<C2421tc> CREATOR = new C2327rm(12);

    /* renamed from: I */
    public final C0307Fr f7410I;

    /* renamed from: R */
    public final C0307Fr f7411R;

    /* renamed from: S */
    public final C0307Fr f7412S;

    /* renamed from: g */
    public final int f7413g;

    /* renamed from: k */
    public final int f7414k;

    /* renamed from: q */
    public final int f7415q;

    /* renamed from: w */
    public final InterfaceC0899Qx f7416w;

    public C2421tc(C0307Fr c0307Fr, C0307Fr c0307Fr2, InterfaceC0899Qx interfaceC0899Qx, C0307Fr c0307Fr3, int i) {
        this.f7412S = c0307Fr;
        this.f7411R = c0307Fr2;
        this.f7410I = c0307Fr3;
        this.f7415q = i;
        this.f7416w = interfaceC0899Qx;
        if (c0307Fr3 != null && c0307Fr.f1058S.compareTo(c0307Fr3.f1058S) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0307Fr3 != null && c0307Fr3.f1058S.compareTo(c0307Fr2.f1058S) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= AbstractC2674yV.m4585P(null).getMaximum(7)) {
            if (c0307Fr.f1058S instanceof GregorianCalendar) {
                int i2 = c0307Fr2.f1062w;
                int i3 = c0307Fr.f1062w;
                this.f7413g = (c0307Fr2.f1057R - c0307Fr.f1057R) + ((i2 - i3) * 12) + 1;
                this.f7414k = (i2 - i3) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2421tc)) {
            return false;
        }
        C2421tc c2421tc = (C2421tc) obj;
        if (this.f7412S.equals(c2421tc.f7412S) && this.f7411R.equals(c2421tc.f7411R) && AbstractC1451bD.m2871z(this.f7410I, c2421tc.f7410I) && this.f7415q == c2421tc.f7415q && this.f7416w.equals(c2421tc.f7416w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7412S, this.f7411R, this.f7410I, Integer.valueOf(this.f7415q), this.f7416w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7412S, 0);
        parcel.writeParcelable(this.f7411R, 0);
        parcel.writeParcelable(this.f7410I, 0);
        parcel.writeParcelable(this.f7416w, 0);
        parcel.writeInt(this.f7415q);
    }
}
