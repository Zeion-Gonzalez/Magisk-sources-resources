package p000a;

/* renamed from: a.GV */
/* loaded from: classes.dex */
public final class EnumC0340GV {

    /* renamed from: R */
    public static final EnumC0340GV f1149R;

    /* renamed from: S */
    public static final EnumC0340GV f1150S;

    /* renamed from: w */
    public static final /* synthetic */ EnumC0340GV[] f1151w;

    static {
        EnumC0340GV enumC0340GV = new EnumC0340GV(0, "Flash");
        f1150S = enumC0340GV;
        EnumC0340GV enumC0340GV2 = new EnumC0340GV(1, "Download");
        f1149R = enumC0340GV2;
        EnumC0340GV[] enumC0340GVArr = {enumC0340GV, enumC0340GV2};
        f1151w = enumC0340GVArr;
        AbstractC0438II.m1051y(enumC0340GVArr);
    }

    public EnumC0340GV(int i, String str) {
        super(str, i);
    }

    public static EnumC0340GV[] values() {
        return (EnumC0340GV[]) f1151w.clone();
    }
}
