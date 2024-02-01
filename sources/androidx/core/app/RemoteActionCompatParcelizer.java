package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000a.AbstractC2267qg;
import p000a.C0593L6;
import p000a.InterfaceC1125V3;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC2267qg abstractC2267qg) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1125V3 interfaceC1125V3 = remoteActionCompat.f8920z;
        boolean z = true;
        if (abstractC2267qg.mo1319N(1)) {
            interfaceC1125V3 = abstractC2267qg.m3906o();
        }
        remoteActionCompat.f8920z = (IconCompat) interfaceC1125V3;
        CharSequence charSequence = remoteActionCompat.f8918h;
        if (abstractC2267qg.mo1319N(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0593L6) abstractC2267qg).f1909N);
        }
        remoteActionCompat.f8918h = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f8919v;
        if (abstractC2267qg.mo1319N(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0593L6) abstractC2267qg).f1909N);
        }
        remoteActionCompat.f8919v = charSequence2;
        remoteActionCompat.f8916P = (PendingIntent) abstractC2267qg.m3907u(remoteActionCompat.f8916P, 4);
        boolean z2 = remoteActionCompat.f8915N;
        if (abstractC2267qg.mo1319N(5)) {
            if (((C0593L6) abstractC2267qg).f1909N.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.f8915N = z2;
        boolean z3 = remoteActionCompat.f8917Q;
        if (abstractC2267qg.mo1319N(6)) {
            if (((C0593L6) abstractC2267qg).f1909N.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f8917Q = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC2267qg abstractC2267qg) {
        abstractC2267qg.getClass();
        IconCompat iconCompat = remoteActionCompat.f8920z;
        abstractC2267qg.mo1320W(1);
        abstractC2267qg.m3902G(iconCompat);
        CharSequence charSequence = remoteActionCompat.f8918h;
        abstractC2267qg.mo1320W(2);
        Parcel parcel = ((C0593L6) abstractC2267qg).f1909N;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f8919v;
        abstractC2267qg.mo1320W(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f8916P;
        abstractC2267qg.mo1320W(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f8915N;
        abstractC2267qg.mo1320W(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f8917Q;
        abstractC2267qg.mo1320W(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
