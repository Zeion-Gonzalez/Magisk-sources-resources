package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* renamed from: a.f7 */
/* loaded from: classes.dex */
public final class C1655f7 extends ViewGroup.MarginLayoutParams {

    /* renamed from: B */
    public float f5123B;

    /* renamed from: BO */
    public int f5124BO;

    /* renamed from: C */
    public float f5125C;

    /* renamed from: D */
    public int f5126D;

    /* renamed from: E */
    public final int f5127E;

    /* renamed from: EC */
    public int f5128EC;

    /* renamed from: F */
    public float f5129F;

    /* renamed from: G */
    public int f5130G;

    /* renamed from: H */
    public final int f5131H;

    /* renamed from: HL */
    public boolean f5132HL;

    /* renamed from: Ha */
    public float f5133Ha;

    /* renamed from: I */
    public int f5134I;

    /* renamed from: J */
    public int f5135J;

    /* renamed from: K */
    public int f5136K;

    /* renamed from: L */
    public int f5137L;

    /* renamed from: Lq */
    public int f5138Lq;

    /* renamed from: M */
    public int f5139M;

    /* renamed from: N */
    public int f5140N;

    /* renamed from: O */
    public int f5141O;

    /* renamed from: P */
    public final boolean f5142P;

    /* renamed from: Pm */
    public C1628ed f5143Pm;

    /* renamed from: Q */
    public int f5144Q;

    /* renamed from: R */
    public int f5145R;

    /* renamed from: S */
    public int f5146S;

    /* renamed from: T */
    public int f5147T;

    /* renamed from: U */
    public int f5148U;

    /* renamed from: U8 */
    public int f5149U8;

    /* renamed from: UZ */
    public int f5150UZ;

    /* renamed from: V */
    public int f5151V;

    /* renamed from: W */
    public int f5152W;

    /* renamed from: X */
    public float f5153X;

    /* renamed from: Y */
    public int f5154Y;

    /* renamed from: Yd */
    public int f5155Yd;

    /* renamed from: Z */
    public String f5156Z;

    /* renamed from: ZH */
    public int f5157ZH;

    /* renamed from: b */
    public boolean f5158b;

    /* renamed from: c */
    public int f5159c;

    /* renamed from: d */
    public int f5160d;

    /* renamed from: dx */
    public float f5161dx;

    /* renamed from: e */
    public final int f5162e;

    /* renamed from: f */
    public int f5163f;

    /* renamed from: g */
    public int f5164g;

    /* renamed from: h */
    public int f5165h;

    /* renamed from: he */
    public int f5166he;

    /* renamed from: i */
    public int f5167i;

    /* renamed from: j */
    public int f5168j;

    /* renamed from: k */
    public float f5169k;

    /* renamed from: l */
    public boolean f5170l;

    /* renamed from: m */
    public int f5171m;

    /* renamed from: n */
    public int f5172n;

    /* renamed from: n0 */
    public int f5173n0;

    /* renamed from: nF */
    public boolean f5174nF;

    /* renamed from: nP */
    public String f5175nP;

    /* renamed from: o */
    public int f5176o;

    /* renamed from: od */
    public boolean f5177od;

    /* renamed from: p */
    public float f5178p;

    /* renamed from: q */
    public int f5179q;

    /* renamed from: qn */
    public boolean f5180qn;

    /* renamed from: r */
    public final int f5181r;

    /* renamed from: s */
    public int f5182s;

    /* renamed from: t */
    public float f5183t;

    /* renamed from: u */
    public int f5184u;

    /* renamed from: v */
    public float f5185v;

    /* renamed from: w */
    public int f5186w;

    /* renamed from: x */
    public int f5187x;

    /* renamed from: y */
    public int f5188y;

    /* renamed from: z */
    public int f5189z;

    /* renamed from: zx */
    public boolean f5190zx;

    public C1655f7() {
        super(-2, -2);
        this.f5189z = -1;
        this.f5165h = -1;
        this.f5185v = -1.0f;
        this.f5142P = true;
        this.f5140N = -1;
        this.f5144Q = -1;
        this.f5184u = -1;
        this.f5176o = -1;
        this.f5152W = -1;
        this.f5130G = -1;
        this.f5139M = -1;
        this.f5151V = -1;
        this.f5146S = -1;
        this.f5145R = -1;
        this.f5186w = -1;
        this.f5134I = -1;
        this.f5179q = 0;
        this.f5169k = 0.0f;
        this.f5164g = -1;
        this.f5188y = -1;
        this.f5182s = -1;
        this.f5148U = -1;
        this.f5127E = Integer.MIN_VALUE;
        this.f5163f = Integer.MIN_VALUE;
        this.f5181r = Integer.MIN_VALUE;
        this.f5154Y = Integer.MIN_VALUE;
        this.f5135J = Integer.MIN_VALUE;
        this.f5159c = Integer.MIN_VALUE;
        this.f5131H = Integer.MIN_VALUE;
        this.f5162e = 0;
        this.f5153X = 0.5f;
        this.f5129F = 0.5f;
        this.f5156Z = null;
        this.f5125C = -1.0f;
        this.f5178p = -1.0f;
        this.f5168j = 0;
        this.f5137L = 0;
        this.f5167i = 0;
        this.f5160d = 0;
        this.f5141O = 0;
        this.f5172n = 0;
        this.f5187x = 0;
        this.f5147T = 0;
        this.f5183t = 1.0f;
        this.f5123B = 1.0f;
        this.f5136K = -1;
        this.f5126D = -1;
        this.f5171m = -1;
        this.f5170l = false;
        this.f5158b = false;
        this.f5175nP = null;
        this.f5155Yd = 0;
        this.f5180qn = true;
        this.f5132HL = true;
        this.f5177od = false;
        this.f5174nF = false;
        this.f5190zx = false;
        this.f5150UZ = -1;
        this.f5173n0 = -1;
        this.f5128EC = -1;
        this.f5149U8 = -1;
        this.f5124BO = Integer.MIN_VALUE;
        this.f5166he = Integer.MIN_VALUE;
        this.f5161dx = 0.5f;
        this.f5143Pm = new C1628ed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x00d0, code lost:
    
        if (r1 > 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00d2, code lost:
    
        ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00df, code lost:
    
        if (r1 > 0) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f1  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1655f7.resolveLayoutDirection(int):void");
    }

    /* renamed from: z */
    public final void m3128z() {
        this.f5174nF = false;
        this.f5180qn = true;
        this.f5132HL = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f5170l) {
            this.f5180qn = false;
            if (this.f5167i == 0) {
                this.f5167i = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f5158b) {
            this.f5132HL = false;
            if (this.f5160d == 0) {
                this.f5160d = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f5180qn = false;
            if (i == 0 && this.f5167i == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f5170l = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f5132HL = false;
            if (i2 == 0 && this.f5160d == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f5158b = true;
            }
        }
        if (this.f5185v == -1.0f && this.f5189z == -1 && this.f5165h == -1) {
            return;
        }
        this.f5174nF = true;
        this.f5180qn = true;
        this.f5132HL = true;
        if (!(this.f5143Pm instanceof C2009ln)) {
            this.f5143Pm = new C2009ln();
        }
        ((C2009ln) this.f5143Pm).m3637i(this.f5171m);
    }

    public C1655f7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.f5189z = -1;
        this.f5165h = -1;
        this.f5185v = -1.0f;
        this.f5142P = true;
        this.f5140N = -1;
        this.f5144Q = -1;
        this.f5184u = -1;
        this.f5176o = -1;
        this.f5152W = -1;
        this.f5130G = -1;
        this.f5139M = -1;
        this.f5151V = -1;
        this.f5146S = -1;
        this.f5145R = -1;
        this.f5186w = -1;
        this.f5134I = -1;
        this.f5179q = 0;
        this.f5169k = 0.0f;
        this.f5164g = -1;
        this.f5188y = -1;
        this.f5182s = -1;
        this.f5148U = -1;
        this.f5127E = Integer.MIN_VALUE;
        this.f5163f = Integer.MIN_VALUE;
        this.f5181r = Integer.MIN_VALUE;
        this.f5154Y = Integer.MIN_VALUE;
        this.f5135J = Integer.MIN_VALUE;
        this.f5159c = Integer.MIN_VALUE;
        this.f5131H = Integer.MIN_VALUE;
        this.f5162e = 0;
        this.f5153X = 0.5f;
        this.f5129F = 0.5f;
        this.f5156Z = null;
        this.f5125C = -1.0f;
        this.f5178p = -1.0f;
        this.f5168j = 0;
        this.f5137L = 0;
        this.f5167i = 0;
        this.f5160d = 0;
        this.f5141O = 0;
        this.f5172n = 0;
        this.f5187x = 0;
        this.f5147T = 0;
        this.f5183t = 1.0f;
        this.f5123B = 1.0f;
        this.f5136K = -1;
        this.f5126D = -1;
        this.f5171m = -1;
        this.f5170l = false;
        this.f5158b = false;
        this.f5175nP = null;
        this.f5155Yd = 0;
        this.f5180qn = true;
        this.f5132HL = true;
        this.f5177od = false;
        this.f5174nF = false;
        this.f5190zx = false;
        this.f5150UZ = -1;
        this.f5173n0 = -1;
        this.f5128EC = -1;
        this.f5149U8 = -1;
        this.f5124BO = Integer.MIN_VALUE;
        this.f5166he = Integer.MIN_VALUE;
        this.f5161dx = 0.5f;
        this.f5143Pm = new C1628ed();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0917RG.f3156h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1659fC.f5195z.get(index);
            switch (i2) {
                case 1:
                    this.f5171m = obtainStyledAttributes.getInt(index, this.f5171m);
                    continue;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f5134I);
                    this.f5134I = resourceId;
                    if (resourceId == -1) {
                        this.f5134I = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 3:
                    this.f5179q = obtainStyledAttributes.getDimensionPixelSize(index, this.f5179q);
                    continue;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.f5169k) % 360.0f;
                    this.f5169k = f;
                    if (f < 0.0f) {
                        this.f5169k = (360.0f - f) % 360.0f;
                    } else {
                        continue;
                    }
                case 5:
                    this.f5189z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5189z);
                    continue;
                case 6:
                    this.f5165h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5165h);
                    continue;
                case 7:
                    this.f5185v = obtainStyledAttributes.getFloat(index, this.f5185v);
                    continue;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f5140N);
                    this.f5140N = resourceId2;
                    if (resourceId2 == -1) {
                        this.f5140N = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f5144Q);
                    this.f5144Q = resourceId3;
                    if (resourceId3 == -1) {
                        this.f5144Q = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f5184u);
                    this.f5184u = resourceId4;
                    if (resourceId4 == -1) {
                        this.f5184u = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f5176o);
                    this.f5176o = resourceId5;
                    if (resourceId5 == -1) {
                        this.f5176o = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f5152W);
                    this.f5152W = resourceId6;
                    if (resourceId6 == -1) {
                        this.f5152W = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f5130G);
                    this.f5130G = resourceId7;
                    if (resourceId7 == -1) {
                        this.f5130G = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f5139M);
                    this.f5139M = resourceId8;
                    if (resourceId8 == -1) {
                        this.f5139M = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f5151V);
                    this.f5151V = resourceId9;
                    if (resourceId9 == -1) {
                        this.f5151V = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f5146S);
                    this.f5146S = resourceId10;
                    if (resourceId10 == -1) {
                        this.f5146S = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f5164g);
                    this.f5164g = resourceId11;
                    if (resourceId11 == -1) {
                        this.f5164g = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f5188y);
                    this.f5188y = resourceId12;
                    if (resourceId12 == -1) {
                        this.f5188y = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f5182s);
                    this.f5182s = resourceId13;
                    if (resourceId13 == -1) {
                        this.f5182s = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f5148U);
                    this.f5148U = resourceId14;
                    if (resourceId14 == -1) {
                        this.f5148U = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 21:
                    this.f5127E = obtainStyledAttributes.getDimensionPixelSize(index, this.f5127E);
                    continue;
                case 22:
                    this.f5163f = obtainStyledAttributes.getDimensionPixelSize(index, this.f5163f);
                    continue;
                case 23:
                    this.f5181r = obtainStyledAttributes.getDimensionPixelSize(index, this.f5181r);
                    continue;
                case 24:
                    this.f5154Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f5154Y);
                    continue;
                case 25:
                    this.f5135J = obtainStyledAttributes.getDimensionPixelSize(index, this.f5135J);
                    continue;
                case 26:
                    this.f5159c = obtainStyledAttributes.getDimensionPixelSize(index, this.f5159c);
                    continue;
                case 27:
                    this.f5170l = obtainStyledAttributes.getBoolean(index, this.f5170l);
                    continue;
                case 28:
                    this.f5158b = obtainStyledAttributes.getBoolean(index, this.f5158b);
                    continue;
                case 29:
                    this.f5153X = obtainStyledAttributes.getFloat(index, this.f5153X);
                    continue;
                case 30:
                    this.f5129F = obtainStyledAttributes.getFloat(index, this.f5129F);
                    continue;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.f5167i = i3;
                    if (i3 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    } else {
                        continue;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.f5160d = i4;
                    if (i4 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    } else {
                        continue;
                    }
                case 33:
                    try {
                        this.f5141O = obtainStyledAttributes.getDimensionPixelSize(index, this.f5141O);
                        continue;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.f5141O) == -2) {
                            this.f5141O = -2;
                        }
                    }
                case 34:
                    try {
                        this.f5187x = obtainStyledAttributes.getDimensionPixelSize(index, this.f5187x);
                        continue;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.f5187x) == -2) {
                            this.f5187x = -2;
                        }
                    }
                case 35:
                    this.f5183t = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5183t));
                    this.f5167i = 2;
                    continue;
                case 36:
                    try {
                        this.f5172n = obtainStyledAttributes.getDimensionPixelSize(index, this.f5172n);
                        continue;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.f5172n) == -2) {
                            this.f5172n = -2;
                        }
                    }
                case 37:
                    try {
                        this.f5147T = obtainStyledAttributes.getDimensionPixelSize(index, this.f5147T);
                        continue;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.f5147T) == -2) {
                            this.f5147T = -2;
                        }
                    }
                case 38:
                    this.f5123B = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f5123B));
                    this.f5160d = 2;
                    continue;
                default:
                    switch (i2) {
                        case 44:
                            C0561KY.m1268o(this, obtainStyledAttributes.getString(index));
                            continue;
                        case 45:
                            this.f5125C = obtainStyledAttributes.getFloat(index, this.f5125C);
                            continue;
                        case 46:
                            this.f5178p = obtainStyledAttributes.getFloat(index, this.f5178p);
                            continue;
                        case 47:
                            this.f5168j = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            this.f5137L = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            this.f5136K = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5136K);
                            continue;
                        case 50:
                            this.f5126D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5126D);
                            continue;
                        case 51:
                            this.f5175nP = obtainStyledAttributes.getString(index);
                            continue;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f5145R);
                            this.f5145R = resourceId15;
                            if (resourceId15 == -1) {
                                this.f5145R = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f5186w);
                            this.f5186w = resourceId16;
                            if (resourceId16 == -1) {
                                this.f5186w = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 54:
                            this.f5162e = obtainStyledAttributes.getDimensionPixelSize(index, this.f5162e);
                            continue;
                        case 55:
                            this.f5131H = obtainStyledAttributes.getDimensionPixelSize(index, this.f5131H);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    C0561KY.m1269u(this, obtainStyledAttributes, index, 0);
                                    continue;
                                    continue;
                                    continue;
                                case 65:
                                    C0561KY.m1269u(this, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    this.f5155Yd = obtainStyledAttributes.getInt(index, this.f5155Yd);
                                    continue;
                                case 67:
                                    this.f5142P = obtainStyledAttributes.getBoolean(index, this.f5142P);
                                    continue;
                            }
                    }
                    break;
            }
            Log.e("ConstraintLayout", str);
        }
        obtainStyledAttributes.recycle();
        m3128z();
    }

    public C1655f7(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5189z = -1;
        this.f5165h = -1;
        this.f5185v = -1.0f;
        this.f5142P = true;
        this.f5140N = -1;
        this.f5144Q = -1;
        this.f5184u = -1;
        this.f5176o = -1;
        this.f5152W = -1;
        this.f5130G = -1;
        this.f5139M = -1;
        this.f5151V = -1;
        this.f5146S = -1;
        this.f5145R = -1;
        this.f5186w = -1;
        this.f5134I = -1;
        this.f5179q = 0;
        this.f5169k = 0.0f;
        this.f5164g = -1;
        this.f5188y = -1;
        this.f5182s = -1;
        this.f5148U = -1;
        this.f5127E = Integer.MIN_VALUE;
        this.f5163f = Integer.MIN_VALUE;
        this.f5181r = Integer.MIN_VALUE;
        this.f5154Y = Integer.MIN_VALUE;
        this.f5135J = Integer.MIN_VALUE;
        this.f5159c = Integer.MIN_VALUE;
        this.f5131H = Integer.MIN_VALUE;
        this.f5162e = 0;
        this.f5153X = 0.5f;
        this.f5129F = 0.5f;
        this.f5156Z = null;
        this.f5125C = -1.0f;
        this.f5178p = -1.0f;
        this.f5168j = 0;
        this.f5137L = 0;
        this.f5167i = 0;
        this.f5160d = 0;
        this.f5141O = 0;
        this.f5172n = 0;
        this.f5187x = 0;
        this.f5147T = 0;
        this.f5183t = 1.0f;
        this.f5123B = 1.0f;
        this.f5136K = -1;
        this.f5126D = -1;
        this.f5171m = -1;
        this.f5170l = false;
        this.f5158b = false;
        this.f5175nP = null;
        this.f5155Yd = 0;
        this.f5180qn = true;
        this.f5132HL = true;
        this.f5177od = false;
        this.f5174nF = false;
        this.f5190zx = false;
        this.f5150UZ = -1;
        this.f5173n0 = -1;
        this.f5128EC = -1;
        this.f5149U8 = -1;
        this.f5124BO = Integer.MIN_VALUE;
        this.f5166he = Integer.MIN_VALUE;
        this.f5161dx = 0.5f;
        this.f5143Pm = new C1628ed();
    }
}
