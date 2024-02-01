package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.AbstractC0068BL;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0293FZ;
import p000a.AbstractC0483J5;
import p000a.AbstractC1285Y3;
import p000a.AbstractC1843ih;
import p000a.AbstractC2221ps;
import p000a.AbstractC2446u3;
import p000a.C0290FV;
import p000a.C0455Id;
import p000a.C0610LT;
import p000a.C0817PD;
import p000a.C1117Uu;
import p000a.C1174Vy;
import p000a.C1972l5;
import p000a.C2189pE;
import p000a.C2192pI;
import p000a.C2236q9;
import p000a.C2417tX;
import p000a.C2444u1;
import p000a.C2457uJ;
import p000a.C2543vs;
import p000a.C2709z9;
import p000a.InterfaceC0656MP;
import p000a.InterfaceC1503cL;
import p000a.InterfaceC1811i6;
import p000a.InterfaceC2335rw;
import p000a.RunnableC1316Yf;
import p000a.RunnableC1328Yt;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC2335rw {

    /* renamed from: B */
    public final ArrayList f8818B;

    /* renamed from: C */
    public final int f8819C;

    /* renamed from: D */
    public final int[] f8820D;

    /* renamed from: E */
    public int f8821E;

    /* renamed from: EC */
    public boolean f8822EC;

    /* renamed from: F */
    public final int f8823F;

    /* renamed from: H */
    public final int f8824H;

    /* renamed from: HL */
    public C2755N f8825HL;

    /* renamed from: I */
    public C2543vs f8826I;

    /* renamed from: J */
    public final int f8827J;

    /* renamed from: K */
    public final ArrayList f8828K;

    /* renamed from: L */
    public final int f8829L;

    /* renamed from: O */
    public CharSequence f8830O;

    /* renamed from: R */
    public C0610LT f8831R;

    /* renamed from: S */
    public ActionMenuView f8832S;

    /* renamed from: T */
    public boolean f8833T;

    /* renamed from: U */
    public Context f8834U;

    /* renamed from: U8 */
    public final RunnableC1316Yf f8835U8;

    /* renamed from: UZ */
    public OnBackInvokedCallback f8836UZ;

    /* renamed from: Yd */
    public C2444u1 f8837Yd;

    /* renamed from: b */
    public C2236q9 f8838b;

    /* renamed from: c */
    public final int f8839c;

    /* renamed from: d */
    public CharSequence f8840d;

    /* renamed from: e */
    public final int f8841e;

    /* renamed from: f */
    public int f8842f;

    /* renamed from: g */
    public final CharSequence f8843g;

    /* renamed from: i */
    public final int f8844i;

    /* renamed from: j */
    public final int f8845j;

    /* renamed from: k */
    public final Drawable f8846k;

    /* renamed from: l */
    public ArrayList f8847l;

    /* renamed from: m */
    public final C1174Vy f8848m;

    /* renamed from: n */
    public ColorStateList f8849n;

    /* renamed from: n0 */
    public OnBackInvokedDispatcher f8850n0;

    /* renamed from: nF */
    public InterfaceC1811i6 f8851nF;

    /* renamed from: nP */
    public final C0817PD f8852nP;

    /* renamed from: od */
    public InterfaceC0656MP f8853od;

    /* renamed from: p */
    public C1972l5 f8854p;

    /* renamed from: q */
    public C2417tX f8855q;

    /* renamed from: qn */
    public C2192pI f8856qn;

    /* renamed from: r */
    public int f8857r;

    /* renamed from: s */
    public View f8858s;

    /* renamed from: t */
    public boolean f8859t;

    /* renamed from: w */
    public C0610LT f8860w;

    /* renamed from: x */
    public ColorStateList f8861x;

    /* renamed from: y */
    public C2543vs f8862y;

    /* renamed from: zx */
    public boolean f8863zx;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: G */
    public static int m4731G(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0293FZ.m612h(marginLayoutParams) + AbstractC0293FZ.m615v(marginLayoutParams);
    }

    /* renamed from: N */
    public static C0455Id m4732N(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0455Id ? new C0455Id((C0455Id) layoutParams) : layoutParams instanceof AbstractC0068BL ? new C0455Id((AbstractC0068BL) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0455Id((ViewGroup.MarginLayoutParams) layoutParams) : new C0455Id(layoutParams);
    }

    /* renamed from: S */
    public static int m4733S(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: E */
    public final void m4734E(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4738P();
        }
        C2543vs c2543vs = this.f8826I;
        if (c2543vs != null) {
            c2543vs.setContentDescription(charSequence);
            AbstractC1843ih.m3411Ha(this.f8826I, charSequence);
        }
    }

    /* renamed from: I */
    public final boolean m4735I(View view) {
        return view.getParent() == this || this.f8828K.contains(view);
    }

    /* renamed from: J */
    public final boolean m4736J(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: M */
    public final C2189pE m4737M() {
        m4755v();
        ActionMenuView actionMenuView = this.f8832S;
        if (actionMenuView.f8759H == null) {
            C2189pE m4719R = actionMenuView.m4719R();
            if (this.f8825HL == null) {
                this.f8825HL = new C2755N(this);
            }
            this.f8832S.f8767p.f6739c = true;
            m4719R.m3798h(this.f8825HL, this.f8834U);
            m4745c();
        }
        return this.f8832S.m4719R();
    }

    /* renamed from: P */
    public final void m4738P() {
        if (this.f8826I == null) {
            this.f8826I = new C2543vs(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0455Id c0455Id = new C0455Id();
            c0455Id.f298z = (this.f8827J & 112) | 8388611;
            this.f8826I.setLayoutParams(c0455Id);
        }
    }

    /* renamed from: Q */
    public final int m4739Q(View view, int i) {
        int i2;
        C0455Id c0455Id = (C0455Id) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = c0455Id.f298z & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f8844i & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) c0455Id).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) c0455Id).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0455Id).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: R */
    public void mo4740R(int i) {
        new C0290FV(getContext()).inflate(i, m4737M());
    }

    /* renamed from: U */
    public final void m4741U(Drawable drawable) {
        if (drawable != null) {
            if (this.f8855q == null) {
                this.f8855q = new C2417tX(getContext(), null, 0);
            }
            if (!m4735I(this.f8855q)) {
                m4748h(this.f8855q, true);
            }
        } else {
            C2417tX c2417tX = this.f8855q;
            if (c2417tX != null && m4735I(c2417tX)) {
                removeView(this.f8855q);
                this.f8828K.remove(this.f8855q);
            }
        }
        C2417tX c2417tX2 = this.f8855q;
        if (c2417tX2 != null) {
            c2417tX2.setImageDrawable(drawable);
        }
    }

    /* renamed from: V */
    public final Drawable m4742V() {
        C2543vs c2543vs = this.f8826I;
        if (c2543vs != null) {
            return c2543vs.getDrawable();
        }
        return null;
    }

    /* renamed from: W */
    public final ArrayList m4743W() {
        ArrayList arrayList = new ArrayList();
        C2189pE m4737M = m4737M();
        for (int i = 0; i < m4737M.size(); i++) {
            arrayList.add(m4737M.getItem(i));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public final void m4744Y(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8831R == null) {
                Context context = getContext();
                C0610LT c0610lt = new C0610LT(context, null);
                this.f8831R = c0610lt;
                c0610lt.setSingleLine();
                this.f8831R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f8842f;
                if (i != 0) {
                    this.f8831R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f8849n;
                if (colorStateList != null) {
                    this.f8831R.setTextColor(colorStateList);
                }
            }
            if (!m4735I(this.f8831R)) {
                m4748h(this.f8831R, true);
            }
        } else {
            C0610LT c0610lt2 = this.f8831R;
            if (c0610lt2 != null && m4735I(c0610lt2)) {
                removeView(this.f8831R);
                this.f8828K.remove(this.f8831R);
            }
        }
        C0610LT c0610lt3 = this.f8831R;
        if (c0610lt3 != null) {
            c0610lt3.setText(charSequence);
        }
        this.f8840d = charSequence;
    }

    /* renamed from: c */
    public final void m4745c() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m3861z = AbstractC2221ps.m3861z(this);
            C2755N c2755n = this.f8825HL;
            int i = 1;
            boolean z2 = false;
            if (c2755n != null && c2755n.f8781R != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && m3861z != null) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC1285Y3.m2633h(this) && this.f8822EC) {
                    z2 = true;
                }
            }
            if (z2 && this.f8850n0 == null) {
                if (this.f8836UZ == null) {
                    this.f8836UZ = AbstractC2221ps.m3859h(new RunnableC1328Yt(this, i));
                }
                AbstractC2221ps.m3860v(m3861z, this.f8836UZ);
            } else if (!z2 && (onBackInvokedDispatcher = this.f8850n0) != null) {
                AbstractC2221ps.m3858P(onBackInvokedDispatcher, this.f8836UZ);
                m3861z = null;
            } else {
                return;
            }
            this.f8850n0 = m3861z;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0455Id);
    }

    /* renamed from: f */
    public void mo4746f(Drawable drawable) {
        if (drawable != null) {
            m4738P();
            if (!m4735I(this.f8826I)) {
                m4748h(this.f8826I, true);
            }
        } else {
            C2543vs c2543vs = this.f8826I;
            if (c2543vs != null && m4735I(c2543vs)) {
                removeView(this.f8826I);
                this.f8828K.remove(this.f8826I);
            }
        }
        C2543vs c2543vs2 = this.f8826I;
        if (c2543vs2 != null) {
            c2543vs2.setImageDrawable(drawable);
        }
    }

    /* renamed from: g */
    public final int m4747g(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0455Id();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0455Id(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final void m4748h(View view, boolean z) {
        C0455Id c0455Id;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0455Id = new C0455Id();
        } else if (!checkLayoutParams(layoutParams)) {
            c0455Id = m4732N(layoutParams);
        } else {
            c0455Id = (C0455Id) layoutParams;
        }
        c0455Id.f1526h = 1;
        if (z && this.f8858s != null) {
            view.setLayoutParams(c0455Id);
            this.f8828K.add(view);
        } else {
            addView(view, c0455Id);
        }
    }

    /* renamed from: k */
    public final int m4749k(View view, int i, int i2, int[] iArr) {
        C0455Id c0455Id = (C0455Id) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0455Id).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m4739Q = m4739Q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m4739Q, max, view.getMeasuredHeight() + m4739Q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0455Id).leftMargin);
    }

    /* renamed from: o */
    public final int m4750o() {
        int i;
        int i2 = 0;
        if (m4742V() != null) {
            C1972l5 c1972l5 = this.f8854p;
            if (c1972l5 != null) {
                if (c1972l5.f6112u) {
                    i = c1972l5.f6110h;
                } else {
                    i = c1972l5.f6114z;
                }
            } else {
                i = 0;
            }
            return Math.max(i, Math.max(this.f8845j, 0));
        }
        C1972l5 c1972l52 = this.f8854p;
        if (c1972l52 != null) {
            if (c1972l52.f6112u) {
                i2 = c1972l52.f6110h;
            } else {
                i2 = c1972l52.f6114z;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4745c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8835U8);
        m4745c();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8859t = false;
        }
        if (!this.f8859t) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8859t = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8859t = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0297 A[LOOP:0: B:263:0x0295->B:264:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02b4 A[LOOP:1: B:266:0x02b2->B:267:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02d2 A[LOOP:2: B:269:0x02d0->B:270:0x02d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0320 A[LOOP:3: B:278:0x031e->B:279:0x0320, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C2189pE c2189pE;
        MenuItem findItem;
        if (!(parcelable instanceof C2457uJ)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2457uJ c2457uJ = (C2457uJ) parcelable;
        super.onRestoreInstanceState(c2457uJ.f8021S);
        ActionMenuView actionMenuView = this.f8832S;
        if (actionMenuView != null) {
            c2189pE = actionMenuView.f8759H;
        } else {
            c2189pE = null;
        }
        int i = c2457uJ.f7540w;
        if (i != 0 && this.f8825HL != null && c2189pE != null && (findItem = c2189pE.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c2457uJ.f7539I) {
            RunnableC1316Yf runnableC1316Yf = this.f8835U8;
            removeCallbacks(runnableC1316Yf);
            post(runnableC1316Yf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002f, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L67;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            a.l5 r0 = r2.f8854p
            if (r0 != 0) goto Le
            a.l5 r0 = new a.l5
            r0.<init>()
            r2.f8854p = r0
        Le:
            a.l5 r0 = r2.f8854p
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f6112u
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f6112u = r1
            boolean r3 = r0.f6111o
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f6108P
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f6107N
        L2b:
            r0.f6114z = r1
            int r1 = r0.f6113v
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f6113v
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f6107N
        L39:
            r0.f6114z = r1
            int r1 = r0.f6108P
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f6107N
            r0.f6114z = r3
        L44:
            int r1 = r0.f6109Q
        L46:
            r0.f6110h = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        C1117Uu c1117Uu;
        C2457uJ c2457uJ = new C2457uJ(super.onSaveInstanceState());
        C2755N c2755n = this.f8825HL;
        if (c2755n != null && (c1117Uu = c2755n.f8781R) != null) {
            c2457uJ.f7540w = c1117Uu.f3653z;
        }
        ActionMenuView actionMenuView = this.f8832S;
        boolean z2 = false;
        if (actionMenuView != null) {
            C2192pI c2192pI = actionMenuView.f8767p;
            if (c2192pI != null && c2192pI.m3806M()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        c2457uJ.f7539I = z2;
        return c2457uJ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8833T = false;
        }
        if (!this.f8833T) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8833T = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8833T = false;
        }
        return true;
    }

    /* renamed from: q */
    public final int m4751q(View view, int i, int i2, int[] iArr) {
        C0455Id c0455Id = (C0455Id) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0455Id).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m4739Q = m4739Q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m4739Q, max + measuredWidth, view.getMeasuredHeight() + m4739Q);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0455Id).rightMargin + max;
    }

    /* renamed from: r */
    public final void m4752r(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8860w == null) {
                Context context = getContext();
                C0610LT c0610lt = new C0610LT(context, null);
                this.f8860w = c0610lt;
                c0610lt.setSingleLine();
                this.f8860w.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f8857r;
                if (i != 0) {
                    this.f8860w.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f8861x;
                if (colorStateList != null) {
                    this.f8860w.setTextColor(colorStateList);
                }
            }
            if (!m4735I(this.f8860w)) {
                m4748h(this.f8860w, true);
            }
        } else {
            C0610LT c0610lt2 = this.f8860w;
            if (c0610lt2 != null && m4735I(c0610lt2)) {
                removeView(this.f8860w);
                this.f8828K.remove(this.f8860w);
            }
        }
        C0610LT c0610lt3 = this.f8860w;
        if (c0610lt3 != null) {
            c0610lt3.setText(charSequence);
        }
        this.f8830O = charSequence;
    }

    /* renamed from: s */
    public final void m4753s() {
        if (!this.f8822EC) {
            this.f8822EC = true;
            m4745c();
        }
    }

    /* renamed from: u */
    public final int m4754u() {
        boolean z;
        int i;
        C2189pE c2189pE;
        ActionMenuView actionMenuView = this.f8832S;
        int i2 = 0;
        if (actionMenuView != null && (c2189pE = actionMenuView.f8759H) != null && c2189pE.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1972l5 c1972l5 = this.f8854p;
            if (c1972l5 != null) {
                if (c1972l5.f6112u) {
                    i = c1972l5.f6114z;
                } else {
                    i = c1972l5.f6110h;
                }
            } else {
                i = 0;
            }
            return Math.max(i, Math.max(this.f8829L, 0));
        }
        C1972l5 c1972l52 = this.f8854p;
        if (c1972l52 != null) {
            if (c1972l52.f6112u) {
                i2 = c1972l52.f6114z;
            } else {
                i2 = c1972l52.f6110h;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public final void m4755v() {
        if (this.f8832S == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f8832S = actionMenuView;
            int i = this.f8821E;
            if (actionMenuView.f8758F != i) {
                actionMenuView.f8758F = i;
                if (i == 0) {
                    actionMenuView.f8763e = actionMenuView.getContext();
                } else {
                    actionMenuView.f8763e = new ContextThemeWrapper(actionMenuView.getContext(), i);
                }
            }
            ActionMenuView actionMenuView2 = this.f8832S;
            actionMenuView2.f8768x = this.f8852nP;
            InterfaceC0656MP interfaceC0656MP = this.f8853od;
            C0817PD c0817pd = new C0817PD(this);
            actionMenuView2.f8765j = interfaceC0656MP;
            actionMenuView2.f8760L = c0817pd;
            C0455Id c0455Id = new C0455Id();
            c0455Id.f298z = (this.f8827J & 112) | 8388613;
            this.f8832S.setLayoutParams(c0455Id);
            m4748h(this.f8832S, false);
        }
    }

    /* renamed from: w */
    public final void m4756w() {
        Iterator it = this.f8847l.iterator();
        while (it.hasNext()) {
            m4737M().removeItem(((MenuItem) it.next()).getItemId());
        }
        C2189pE m4737M = m4737M();
        ArrayList m4743W = m4743W();
        C0290FV c0290fv = new C0290FV(getContext());
        Iterator it2 = ((CopyOnWriteArrayList) this.f8848m.f3830w).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1503cL) it2.next()).mo2522v(m4737M, c0290fv);
        }
        ArrayList m4743W2 = m4743W();
        m4743W2.removeAll(m4743W);
        this.f8847l = m4743W2;
    }

    /* renamed from: y */
    public final void m4757y(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: z */
    public final void m4758z(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m199P(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, AbstractC0095Bq.m199P(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0455Id c0455Id = (C0455Id) childAt.getLayoutParams();
                if (c0455Id.f1526h == 0 && m4736J(childAt)) {
                    int i3 = c0455Id.f298z;
                    WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                    int m199P = AbstractC0095Bq.m199P(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, m199P) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = m199P == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            C0455Id c0455Id2 = (C0455Id) childAt2.getLayoutParams();
            if (c0455Id2.f1526h == 0 && m4736J(childAt2)) {
                int i5 = c0455Id2.f298z;
                WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                int m199P2 = AbstractC0095Bq.m199P(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, m199P2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = m199P2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f8844i = 8388627;
        this.f8818B = new ArrayList();
        this.f8828K = new ArrayList();
        this.f8820D = new int[2];
        this.f8848m = new C1174Vy((Runnable) new RunnableC1328Yt(this, 0));
        this.f8847l = new ArrayList();
        this.f8852nP = new C0817PD(this);
        this.f8835U8 = new RunnableC1316Yf(this, 1);
        Context context2 = getContext();
        int[] iArr = AbstractC0483J5.f1620r;
        C2709z9 m4639S = C2709z9.m4639S(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = m4639S.f8534h;
        AbstractC2446u3.m4215M(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle);
        this.f8842f = m4639S.m4646W(28, 0);
        this.f8857r = m4639S.m4646W(19, 0);
        this.f8844i = ((TypedArray) obj).getInteger(0, 8388627);
        this.f8827J = ((TypedArray) obj).getInteger(2, 48);
        int m4650v = m4639S.m4650v(22, 0);
        m4650v = m4639S.m4645V(27) ? m4639S.m4650v(27, m4650v) : m4650v;
        this.f8819C = m4650v;
        this.f8823F = m4650v;
        this.f8841e = m4650v;
        this.f8824H = m4650v;
        int m4650v2 = m4639S.m4650v(25, -1);
        if (m4650v2 >= 0) {
            this.f8824H = m4650v2;
        }
        int m4650v3 = m4639S.m4650v(24, -1);
        if (m4650v3 >= 0) {
            this.f8841e = m4650v3;
        }
        int m4650v4 = m4639S.m4650v(26, -1);
        if (m4650v4 >= 0) {
            this.f8823F = m4650v4;
        }
        int m4650v5 = m4639S.m4650v(23, -1);
        if (m4650v5 >= 0) {
            this.f8819C = m4650v5;
        }
        this.f8839c = m4639S.m4643P(13, -1);
        int m4650v6 = m4639S.m4650v(9, Integer.MIN_VALUE);
        int m4650v7 = m4639S.m4650v(5, Integer.MIN_VALUE);
        int m4643P = m4639S.m4643P(7, 0);
        int m4643P2 = m4639S.m4643P(8, 0);
        if (this.f8854p == null) {
            this.f8854p = new C1972l5();
        }
        C1972l5 c1972l5 = this.f8854p;
        c1972l5.f6111o = false;
        if (m4643P != Integer.MIN_VALUE) {
            c1972l5.f6107N = m4643P;
            c1972l5.f6114z = m4643P;
        }
        if (m4643P2 != Integer.MIN_VALUE) {
            c1972l5.f6109Q = m4643P2;
            c1972l5.f6110h = m4643P2;
        }
        if (m4650v6 != Integer.MIN_VALUE || m4650v7 != Integer.MIN_VALUE) {
            c1972l5.m3585z(m4650v6, m4650v7);
        }
        this.f8845j = m4639S.m4650v(10, Integer.MIN_VALUE);
        this.f8829L = m4639S.m4650v(6, Integer.MIN_VALUE);
        this.f8846k = m4639S.m4642N(4);
        this.f8843g = m4639S.m4641M(3);
        CharSequence m4641M = m4639S.m4641M(21);
        if (!TextUtils.isEmpty(m4641M)) {
            m4744Y(m4641M);
        }
        CharSequence m4641M2 = m4639S.m4641M(18);
        if (!TextUtils.isEmpty(m4641M2)) {
            m4752r(m4641M2);
        }
        this.f8834U = getContext();
        int m4646W = m4639S.m4646W(17, 0);
        if (this.f8821E != m4646W) {
            this.f8821E = m4646W;
            if (m4646W == 0) {
                this.f8834U = getContext();
            } else {
                this.f8834U = new ContextThemeWrapper(getContext(), m4646W);
            }
        }
        Drawable m4642N = m4639S.m4642N(16);
        if (m4642N != null) {
            mo4746f(m4642N);
        }
        CharSequence m4641M3 = m4639S.m4641M(15);
        if (!TextUtils.isEmpty(m4641M3)) {
            m4734E(m4641M3);
        }
        Drawable m4642N2 = m4639S.m4642N(11);
        if (m4642N2 != null) {
            m4741U(m4642N2);
        }
        CharSequence m4641M4 = m4639S.m4641M(12);
        if (!TextUtils.isEmpty(m4641M4)) {
            if (!TextUtils.isEmpty(m4641M4) && this.f8855q == null) {
                this.f8855q = new C2417tX(getContext(), null, 0);
            }
            C2417tX c2417tX = this.f8855q;
            if (c2417tX != null) {
                c2417tX.setContentDescription(m4641M4);
            }
        }
        if (m4639S.m4645V(29)) {
            ColorStateList m4647h = m4639S.m4647h(29);
            this.f8849n = m4647h;
            C0610LT c0610lt = this.f8831R;
            if (c0610lt != null) {
                c0610lt.setTextColor(m4647h);
            }
        }
        if (m4639S.m4645V(20)) {
            ColorStateList m4647h2 = m4639S.m4647h(20);
            this.f8861x = m4647h2;
            C0610LT c0610lt2 = this.f8860w;
            if (c0610lt2 != null) {
                c0610lt2.setTextColor(m4647h2);
            }
        }
        if (m4639S.m4645V(14)) {
            mo4740R(m4639S.m4646W(14, 0));
        }
        m4639S.m4651w();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4732N(layoutParams);
    }
}
