package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000a.AbstractC2267qg;
import p000a.C0593L6;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC2267qg abstractC2267qg) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f8931z = abstractC2267qg.m3904Q(iconCompat.f8931z, 1);
        byte[] bArr = iconCompat.f8930v;
        if (abstractC2267qg.mo1319N(2)) {
            Parcel parcel = ((C0593L6) abstractC2267qg).f1909N;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f8930v = bArr;
        iconCompat.f8924P = abstractC2267qg.m3907u(iconCompat.f8924P, 3);
        iconCompat.f8923N = abstractC2267qg.m3904Q(iconCompat.f8923N, 4);
        iconCompat.f8925Q = abstractC2267qg.m3904Q(iconCompat.f8925Q, 5);
        iconCompat.f8929u = (ColorStateList) abstractC2267qg.m3907u(iconCompat.f8929u, 6);
        String str = iconCompat.f8926W;
        if (abstractC2267qg.mo1319N(7)) {
            str = ((C0593L6) abstractC2267qg).f1909N.readString();
        }
        iconCompat.f8926W = str;
        String str2 = iconCompat.f8922G;
        if (abstractC2267qg.mo1319N(8)) {
            str2 = ((C0593L6) abstractC2267qg).f1909N.readString();
        }
        iconCompat.f8922G = str2;
        iconCompat.f8928o = PorterDuff.Mode.valueOf(iconCompat.f8926W);
        switch (iconCompat.f8931z) {
            case -1:
                parcelable = iconCompat.f8924P;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f8927h = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f8924P;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.f8930v;
                    iconCompat.f8927h = bArr3;
                    iconCompat.f8931z = 3;
                    iconCompat.f8923N = 0;
                    iconCompat.f8925Q = bArr3.length;
                    break;
                }
                iconCompat.f8927h = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f8930v, Charset.forName("UTF-16"));
                iconCompat.f8927h = str3;
                if (iconCompat.f8931z == 2 && iconCompat.f8922G == null) {
                    iconCompat.f8922G = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f8927h = iconCompat.f8930v;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC2267qg abstractC2267qg) {
        abstractC2267qg.getClass();
        iconCompat.f8926W = iconCompat.f8928o.name();
        switch (iconCompat.f8931z) {
            case -1:
            case 1:
            case 5:
                iconCompat.f8924P = (Parcelable) iconCompat.f8927h;
                break;
            case 2:
                iconCompat.f8930v = ((String) iconCompat.f8927h).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f8930v = (byte[]) iconCompat.f8927h;
                break;
            case 4:
            case 6:
                iconCompat.f8930v = iconCompat.f8927h.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f8931z;
        if (-1 != i) {
            abstractC2267qg.mo1320W(1);
            ((C0593L6) abstractC2267qg).f1909N.writeInt(i);
        }
        byte[] bArr = iconCompat.f8930v;
        if (bArr != null) {
            abstractC2267qg.mo1320W(2);
            int length = bArr.length;
            Parcel parcel = ((C0593L6) abstractC2267qg).f1909N;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f8924P;
        if (parcelable != null) {
            abstractC2267qg.mo1320W(3);
            ((C0593L6) abstractC2267qg).f1909N.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f8923N;
        if (i2 != 0) {
            abstractC2267qg.mo1320W(4);
            ((C0593L6) abstractC2267qg).f1909N.writeInt(i2);
        }
        int i3 = iconCompat.f8925Q;
        if (i3 != 0) {
            abstractC2267qg.mo1320W(5);
            ((C0593L6) abstractC2267qg).f1909N.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f8929u;
        if (colorStateList != null) {
            abstractC2267qg.mo1320W(6);
            ((C0593L6) abstractC2267qg).f1909N.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f8926W;
        if (str != null) {
            abstractC2267qg.mo1320W(7);
            ((C0593L6) abstractC2267qg).f1909N.writeString(str);
        }
        String str2 = iconCompat.f8922G;
        if (str2 != null) {
            abstractC2267qg.mo1320W(8);
            ((C0593L6) abstractC2267qg).f1909N.writeString(str2);
        }
    }
}
