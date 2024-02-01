package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: a.Mu */
/* loaded from: classes.dex */
public final class C0682Mu implements Parcelable {
    public static final Parcelable.Creator<C0682Mu> CREATOR = new C0773OP(0);

    /* renamed from: E */
    public final CharSequence f2245E;

    /* renamed from: I */
    public final int[] f2246I;

    /* renamed from: R */
    public final ArrayList f2247R;

    /* renamed from: S */
    public final int[] f2248S;

    /* renamed from: U */
    public final int f2249U;

    /* renamed from: Y */
    public final boolean f2250Y;

    /* renamed from: f */
    public final ArrayList f2251f;

    /* renamed from: g */
    public final int f2252g;

    /* renamed from: k */
    public final String f2253k;

    /* renamed from: q */
    public final int f2254q;

    /* renamed from: r */
    public final ArrayList f2255r;

    /* renamed from: s */
    public final CharSequence f2256s;

    /* renamed from: w */
    public final int[] f2257w;

    /* renamed from: y */
    public final int f2258y;

    public C0682Mu(C0398HY c0398hy) {
        int size = c0398hy.f1347z.size();
        this.f2248S = new int[size * 6];
        if (!c0398hy.f1343u) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2247R = new ArrayList(size);
        this.f2257w = new int[size];
        this.f2246I = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0547KI c0547ki = (C0547KI) c0398hy.f1347z.get(i);
            int i3 = i2 + 1;
            this.f2248S[i2] = c0547ki.f1807z;
            ArrayList arrayList = this.f2247R;
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c0547ki.f1803h;
            arrayList.add(abstractComponentCallbacksC2342s3 != null ? abstractComponentCallbacksC2342s3.f7218q : null);
            int[] iArr = this.f2248S;
            int i4 = i3 + 1;
            iArr[i3] = c0547ki.f1806v ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = c0547ki.f1800P;
            int i6 = i5 + 1;
            iArr[i5] = c0547ki.f1799N;
            int i7 = i6 + 1;
            iArr[i6] = c0547ki.f1801Q;
            iArr[i7] = c0547ki.f1805u;
            this.f2257w[i] = c0547ki.f1804o.ordinal();
            this.f2246I[i] = c0547ki.f1802W.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f2254q = c0398hy.f1333Q;
        this.f2253k = c0398hy.f1337W;
        this.f2252g = c0398hy.f1338g;
        this.f2258y = c0398hy.f1328G;
        this.f2256s = c0398hy.f1330M;
        this.f2249U = c0398hy.f1336V;
        this.f2245E = c0398hy.f1335S;
        this.f2251f = c0398hy.f1334R;
        this.f2255r = c0398hy.f1345w;
        this.f2250Y = c0398hy.f1329I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final void m1581h(C0398HY c0398hy) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2248S;
            boolean z = true;
            if (i < iArr.length) {
                C0547KI c0547ki = new C0547KI();
                int i3 = i + 1;
                c0547ki.f1807z = iArr[i];
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "Instantiate " + c0398hy + " op #" + i2 + " base fragment #" + iArr[i3]);
                }
                EnumC1632eh[] enumC1632ehArr = EnumC1632eh.f5090k;
                c0547ki.f1804o = ((EnumC1632eh[]) enumC1632ehArr.clone())[this.f2257w[i2]];
                c0547ki.f1802W = ((EnumC1632eh[]) enumC1632ehArr.clone())[this.f2246I[i2]];
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                c0547ki.f1806v = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                c0547ki.f1800P = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                c0547ki.f1799N = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                c0547ki.f1801Q = i10;
                int i11 = iArr[i9];
                c0547ki.f1805u = i11;
                c0398hy.f1339h = i6;
                c0398hy.f1344v = i8;
                c0398hy.f1332P = i10;
                c0398hy.f1331N = i11;
                c0398hy.m894h(c0547ki);
                i2++;
                i = i9 + 1;
            } else {
                c0398hy.f1333Q = this.f2254q;
                c0398hy.f1337W = this.f2253k;
                c0398hy.f1343u = true;
                c0398hy.f1328G = this.f2258y;
                c0398hy.f1330M = this.f2256s;
                c0398hy.f1336V = this.f2249U;
                c0398hy.f1335S = this.f2245E;
                c0398hy.f1334R = this.f2251f;
                c0398hy.f1345w = this.f2255r;
                c0398hy.f1329I = this.f2250Y;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2248S);
        parcel.writeStringList(this.f2247R);
        parcel.writeIntArray(this.f2257w);
        parcel.writeIntArray(this.f2246I);
        parcel.writeInt(this.f2254q);
        parcel.writeString(this.f2253k);
        parcel.writeInt(this.f2252g);
        parcel.writeInt(this.f2258y);
        TextUtils.writeToParcel(this.f2256s, parcel, 0);
        parcel.writeInt(this.f2249U);
        TextUtils.writeToParcel(this.f2245E, parcel, 0);
        parcel.writeStringList(this.f2251f);
        parcel.writeStringList(this.f2255r);
        parcel.writeInt(this.f2250Y ? 1 : 0);
    }

    public C0682Mu(Parcel parcel) {
        this.f2248S = parcel.createIntArray();
        this.f2247R = parcel.createStringArrayList();
        this.f2257w = parcel.createIntArray();
        this.f2246I = parcel.createIntArray();
        this.f2254q = parcel.readInt();
        this.f2253k = parcel.readString();
        this.f2252g = parcel.readInt();
        this.f2258y = parcel.readInt();
        this.f2256s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2249U = parcel.readInt();
        this.f2245E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2251f = parcel.createStringArrayList();
        this.f2255r = parcel.createStringArrayList();
        this.f2250Y = parcel.readInt() != 0;
    }
}
