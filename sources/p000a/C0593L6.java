package p000a;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: a.L6 */
/* loaded from: classes.dex */
public final class C0593L6 extends AbstractC2267qg {

    /* renamed from: G */
    public int f1907G;

    /* renamed from: M */
    public int f1908M;

    /* renamed from: N */
    public final Parcel f1909N;

    /* renamed from: P */
    public final SparseIntArray f1910P;

    /* renamed from: Q */
    public final int f1911Q;

    /* renamed from: W */
    public int f1912W;

    /* renamed from: o */
    public final String f1913o;

    /* renamed from: u */
    public final int f1914u;

    public C0593L6(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1186WB(), new C1186WB(), new C1186WB());
    }

    @Override // p000a.AbstractC2267qg
    /* renamed from: N */
    public final boolean mo1319N(int i) {
        while (this.f1907G < this.f1914u) {
            int i2 = this.f1908M;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f1907G;
            Parcel parcel = this.f1909N;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f1908M = parcel.readInt();
            this.f1907G += readInt;
        }
        return this.f1908M == i;
    }

    @Override // p000a.AbstractC2267qg
    /* renamed from: W */
    public final void mo1320W(int i) {
        int i2 = this.f1912W;
        SparseIntArray sparseIntArray = this.f1910P;
        Parcel parcel = this.f1909N;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.f1912W = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // p000a.AbstractC2267qg
    /* renamed from: z */
    public final C0593L6 mo1321z() {
        Parcel parcel = this.f1909N;
        int dataPosition = parcel.dataPosition();
        int i = this.f1907G;
        if (i == this.f1911Q) {
            i = this.f1914u;
        }
        return new C0593L6(parcel, dataPosition, i, AbstractC2441tz.m4187M(new StringBuilder(), this.f1913o, "  "), this.f6973z, this.f6971h, this.f6972v);
    }

    public C0593L6(Parcel parcel, int i, int i2, String str, C1186WB c1186wb, C1186WB c1186wb2, C1186WB c1186wb3) {
        super(c1186wb, c1186wb2, c1186wb3);
        this.f1910P = new SparseIntArray();
        this.f1912W = -1;
        this.f1908M = -1;
        this.f1909N = parcel;
        this.f1911Q = i;
        this.f1914u = i2;
        this.f1907G = i;
        this.f1913o = str;
    }
}
