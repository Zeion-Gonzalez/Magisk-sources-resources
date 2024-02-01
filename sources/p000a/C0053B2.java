package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: a.B2 */
/* loaded from: classes.dex */
public final class C0053B2 implements Parcelable {
    public static final Parcelable.Creator<C0053B2> CREATOR = new C2327rm(10);

    /* renamed from: C */
    public Integer f206C;

    /* renamed from: E */
    public int f207E;

    /* renamed from: F */
    public Boolean f208F;

    /* renamed from: H */
    public int f209H;

    /* renamed from: I */
    public Integer f210I;

    /* renamed from: J */
    public CharSequence f211J;

    /* renamed from: L */
    public Integer f212L;

    /* renamed from: O */
    public Integer f213O;

    /* renamed from: R */
    public Integer f214R;

    /* renamed from: S */
    public int f215S;

    /* renamed from: U */
    public String f216U;

    /* renamed from: X */
    public Integer f217X;

    /* renamed from: Y */
    public Locale f218Y;

    /* renamed from: Z */
    public Integer f219Z;

    /* renamed from: c */
    public CharSequence f220c;

    /* renamed from: d */
    public Integer f221d;

    /* renamed from: e */
    public int f222e;

    /* renamed from: f */
    public int f223f;

    /* renamed from: g */
    public Integer f224g;

    /* renamed from: i */
    public Integer f225i;

    /* renamed from: j */
    public Integer f226j;

    /* renamed from: k */
    public Integer f227k;

    /* renamed from: n */
    public Integer f228n;

    /* renamed from: p */
    public Integer f229p;

    /* renamed from: q */
    public Integer f230q;

    /* renamed from: r */
    public int f231r;

    /* renamed from: s */
    public int f232s;

    /* renamed from: w */
    public Integer f233w;

    /* renamed from: x */
    public Boolean f234x;

    /* renamed from: y */
    public Integer f235y;

    public C0053B2() {
        this.f232s = 255;
        this.f207E = -2;
        this.f223f = -2;
        this.f231r = -2;
        this.f208F = Boolean.TRUE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f215S);
        parcel.writeSerializable(this.f214R);
        parcel.writeSerializable(this.f233w);
        parcel.writeSerializable(this.f210I);
        parcel.writeSerializable(this.f230q);
        parcel.writeSerializable(this.f227k);
        parcel.writeSerializable(this.f224g);
        parcel.writeSerializable(this.f235y);
        parcel.writeInt(this.f232s);
        parcel.writeString(this.f216U);
        parcel.writeInt(this.f207E);
        parcel.writeInt(this.f223f);
        parcel.writeInt(this.f231r);
        CharSequence charSequence = this.f211J;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f220c;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f209H);
        parcel.writeSerializable(this.f217X);
        parcel.writeSerializable(this.f219Z);
        parcel.writeSerializable(this.f206C);
        parcel.writeSerializable(this.f229p);
        parcel.writeSerializable(this.f226j);
        parcel.writeSerializable(this.f212L);
        parcel.writeSerializable(this.f225i);
        parcel.writeSerializable(this.f228n);
        parcel.writeSerializable(this.f221d);
        parcel.writeSerializable(this.f213O);
        parcel.writeSerializable(this.f208F);
        parcel.writeSerializable(this.f218Y);
        parcel.writeSerializable(this.f234x);
    }

    public C0053B2(Parcel parcel) {
        this.f232s = 255;
        this.f207E = -2;
        this.f223f = -2;
        this.f231r = -2;
        this.f208F = Boolean.TRUE;
        this.f215S = parcel.readInt();
        this.f214R = (Integer) parcel.readSerializable();
        this.f233w = (Integer) parcel.readSerializable();
        this.f210I = (Integer) parcel.readSerializable();
        this.f230q = (Integer) parcel.readSerializable();
        this.f227k = (Integer) parcel.readSerializable();
        this.f224g = (Integer) parcel.readSerializable();
        this.f235y = (Integer) parcel.readSerializable();
        this.f232s = parcel.readInt();
        this.f216U = parcel.readString();
        this.f207E = parcel.readInt();
        this.f223f = parcel.readInt();
        this.f231r = parcel.readInt();
        this.f211J = parcel.readString();
        this.f220c = parcel.readString();
        this.f209H = parcel.readInt();
        this.f217X = (Integer) parcel.readSerializable();
        this.f219Z = (Integer) parcel.readSerializable();
        this.f206C = (Integer) parcel.readSerializable();
        this.f229p = (Integer) parcel.readSerializable();
        this.f226j = (Integer) parcel.readSerializable();
        this.f212L = (Integer) parcel.readSerializable();
        this.f225i = (Integer) parcel.readSerializable();
        this.f228n = (Integer) parcel.readSerializable();
        this.f221d = (Integer) parcel.readSerializable();
        this.f213O = (Integer) parcel.readSerializable();
        this.f208F = (Boolean) parcel.readSerializable();
        this.f218Y = (Locale) parcel.readSerializable();
        this.f234x = (Boolean) parcel.readSerializable();
    }
}
