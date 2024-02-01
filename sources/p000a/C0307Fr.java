package p000a;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: a.Fr */
/* loaded from: classes.dex */
public final class C0307Fr implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0307Fr> CREATOR = new C2327rm(14);

    /* renamed from: I */
    public final int f1056I;

    /* renamed from: R */
    public final int f1057R;

    /* renamed from: S */
    public final Calendar f1058S;

    /* renamed from: g */
    public String f1059g;

    /* renamed from: k */
    public final long f1060k;

    /* renamed from: q */
    public final int f1061q;

    /* renamed from: w */
    public final int f1062w;

    public C0307Fr(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m4586h = AbstractC2674yV.m4586h(calendar);
        this.f1058S = m4586h;
        this.f1057R = m4586h.get(2);
        this.f1062w = m4586h.get(1);
        this.f1056I = m4586h.getMaximum(7);
        this.f1061q = m4586h.getActualMaximum(5);
        this.f1060k = m4586h.getTimeInMillis();
    }

    /* renamed from: P */
    public static C0307Fr m650P(long j) {
        Calendar m4585P = AbstractC2674yV.m4585P(null);
        m4585P.setTimeInMillis(j);
        return new C0307Fr(m4585P);
    }

    /* renamed from: h */
    public static C0307Fr m651h(int i, int i2) {
        Calendar m4585P = AbstractC2674yV.m4585P(null);
        m4585P.set(1, i);
        m4585P.set(2, i2);
        return new C0307Fr(m4585P);
    }

    /* renamed from: N */
    public final String m652N() {
        String formatDateTime;
        if (this.f1059g == null) {
            long timeInMillis = this.f1058S.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = AbstractC2674yV.m4588z("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f1059g = formatDateTime;
        }
        return this.f1059g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1058S.compareTo(((C0307Fr) obj).f1058S);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0307Fr)) {
            return false;
        }
        C0307Fr c0307Fr = (C0307Fr) obj;
        return this.f1057R == c0307Fr.f1057R && this.f1062w == c0307Fr.f1062w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1057R), Integer.valueOf(this.f1062w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1062w);
        parcel.writeInt(this.f1057R);
    }
}
