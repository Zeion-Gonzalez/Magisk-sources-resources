package p000a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.BH */
/* loaded from: classes.dex */
public final class C0065BH extends FrameLayout implements InterfaceC0157D3 {

    /* renamed from: B */
    public int f262B;

    /* renamed from: C */
    public C1117Uu f263C;

    /* renamed from: E */
    public boolean f264E;

    /* renamed from: F */
    public int f265F;

    /* renamed from: H */
    public final TextView f266H;

    /* renamed from: I */
    public int f267I;

    /* renamed from: J */
    public final ImageView f268J;

    /* renamed from: K */
    public C1773hL f269K;

    /* renamed from: L */
    public Drawable f270L;

    /* renamed from: O */
    public float f271O;

    /* renamed from: R */
    public ColorStateList f272R;

    /* renamed from: S */
    public boolean f273S;

    /* renamed from: T */
    public int f274T;

    /* renamed from: U */
    public int f275U;

    /* renamed from: c */
    public final ViewGroup f276c;

    /* renamed from: d */
    public C1219Wm f277d;

    /* renamed from: e */
    public final TextView f278e;

    /* renamed from: f */
    public final FrameLayout f279f;

    /* renamed from: g */
    public float f280g;

    /* renamed from: i */
    public ValueAnimator f281i;

    /* renamed from: j */
    public Drawable f282j;

    /* renamed from: k */
    public int f283k;

    /* renamed from: n */
    public boolean f284n;

    /* renamed from: p */
    public ColorStateList f285p;

    /* renamed from: q */
    public int f286q;

    /* renamed from: r */
    public final View f287r;

    /* renamed from: s */
    public float f288s;

    /* renamed from: t */
    public boolean f289t;

    /* renamed from: w */
    public Drawable f290w;

    /* renamed from: x */
    public int f291x;

    /* renamed from: y */
    public float f292y;

    /* renamed from: D */
    public static final int[] f259D = {16842912};

    /* renamed from: m */
    public static final C1219Wm f261m = new C1219Wm((Object) null);

    /* renamed from: l */
    public static final C0742Nv f260l = new C0742Nv();

    public C0065BH(Context context) {
        super(context);
        this.f273S = false;
        this.f265F = 0;
        this.f277d = f261m;
        this.f271O = 0.0f;
        this.f284n = false;
        this.f291x = 0;
        this.f274T = 0;
        this.f289t = false;
        this.f262B = 0;
        int i = 1;
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        this.f279f = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f287r = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f268J = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f276c = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f266H = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f278e = textView2;
        setBackgroundResource(R.drawable.mtrl_navigation_bar_item_background);
        this.f267I = getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.f286q = viewGroup.getPaddingBottom();
        this.f283k = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4123g(textView, 2);
        AbstractC2397t8.m4123g(textView2, 2);
        setFocusable(true);
        m123h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1657fA(i, this));
        }
    }

    /* renamed from: f */
    public static void m108f(ViewGroup viewGroup, int i) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m109g(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = p000a.AbstractC0863Q8.f2941p
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0065BH.m109g(android.widget.TextView, int):void");
    }

    /* renamed from: s */
    public static void m110s(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: E */
    public final void m111E(int i) {
        boolean z;
        int i2;
        View view = this.f287r;
        if (view != null && i > 0) {
            int min = Math.min(this.f291x, i - (this.f262B * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f289t && this.f275U == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = min;
            } else {
                i2 = this.f274T;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    /* renamed from: G */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC2278qv(i, 1, this));
    }

    @Override // android.view.View
    /* renamed from: I */
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f266H.setEnabled(z);
        this.f278e.setEnabled(z);
        this.f268J.setEnabled(z);
        C2196pM c2196pM = null;
        if (z) {
            Context context = getContext();
            int i = 9;
            if (Build.VERSION.SDK_INT >= 24) {
                c2196pM = new C2196pM(i, AbstractC0252Eo.m549h(context, 1002));
            } else {
                c2196pM = new C2196pM(i, c2196pM);
            }
        }
        AbstractC2446u3.m4219R(this, c2196pM);
    }

    /* renamed from: M */
    public final void m114M() {
        C1117Uu c1117Uu = this.f263C;
        if (c1117Uu != null) {
            m129w(c1117Uu.isChecked());
        }
    }

    /* renamed from: N */
    public final View m115N() {
        FrameLayout frameLayout = this.f279f;
        if (frameLayout == null) {
            return this.f268J;
        }
        return frameLayout;
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: P */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f279f;
        if (frameLayout != null && this.f284n) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    /* renamed from: Q */
    public final int getSuggestedMinimumHeight() {
        int i;
        ViewGroup viewGroup = this.f276c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int measuredHeight = m115N().getMeasuredHeight() + ((FrameLayout.LayoutParams) m115N().getLayoutParams()).topMargin;
        if (viewGroup.getVisibility() == 0) {
            i = this.f283k;
        } else {
            i = 0;
        }
        return viewGroup.getMeasuredHeight() + measuredHeight + i + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: R */
    public final void m118R(C1773hL c1773hL) {
        boolean z;
        C1773hL c1773hL2 = this.f269K;
        if (c1773hL2 != c1773hL) {
            boolean z2 = true;
            if (c1773hL2 != null) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView = this.f268J;
            if (z && imageView != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                m120U(imageView);
            }
            this.f269K = c1773hL;
            if (imageView != null) {
                if (c1773hL == null) {
                    z2 = false;
                }
                if (z2) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    C1773hL c1773hL3 = this.f269K;
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    c1773hL3.setBounds(rect);
                    c1773hL3.m3303o(imageView, null);
                    if (c1773hL3.m3305v() != null) {
                        c1773hL3.m3305v().setForeground(c1773hL3);
                    } else {
                        imageView.getOverlay().add(c1773hL3);
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public final void m119S(float f, float f2) {
        float f3;
        float f4;
        View view = this.f287r;
        if (view != null) {
            C1219Wm c1219Wm = this.f277d;
            c1219Wm.getClass();
            LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(c1219Wm.mo1716h(f, f2));
            if (f2 == 0.0f) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (f2 == 0.0f) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            view.setAlpha(AbstractC1090US.m2263z(0.0f, 1.0f, f3, f4, f));
        }
        this.f271O = f;
    }

    /* renamed from: U */
    public final void m120U(ImageView imageView) {
        boolean z;
        if (this.f269K != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C1773hL c1773hL = this.f269K;
                if (c1773hL != null) {
                    if (c1773hL.m3305v() != null) {
                        c1773hL.m3305v().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c1773hL);
                    }
                }
            }
            this.f269K = null;
        }
    }

    /* renamed from: V */
    public final void m121V() {
        Drawable background;
        Drawable background2;
        Drawable drawable = this.f290w;
        ColorStateList colorStateList = this.f272R;
        FrameLayout frameLayout = this.f279f;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (colorStateList != null) {
            View view = this.f287r;
            if (view == null) {
                background = null;
            } else {
                background = view.getBackground();
            }
            if (this.f284n) {
                if (view == null) {
                    background2 = null;
                } else {
                    background2 = view.getBackground();
                }
                if (background2 != null && frameLayout != null && background != null) {
                    rippleDrawable = new RippleDrawable(AbstractC0567Ke.m1282h(this.f272R), null, background);
                    z = false;
                }
            }
            if (drawable == null) {
                ColorStateList colorStateList2 = this.f272R;
                int m1284z = AbstractC0567Ke.m1284z(colorStateList2, AbstractC0567Ke.f1844v);
                int[] iArr = AbstractC0567Ke.f1843h;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{AbstractC0567Ke.f1841P, iArr, StateSet.NOTHING}, new int[]{m1284z, AbstractC0567Ke.m1284z(colorStateList2, iArr), AbstractC0567Ke.m1284z(colorStateList2, AbstractC0567Ke.f1845z)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.View
    /* renamed from: W */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        boolean z;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1773hL c1773hL = this.f269K;
        if (c1773hL != null && c1773hL.isVisible()) {
            C1117Uu c1117Uu = this.f263C;
            CharSequence charSequence2 = c1117Uu.f3631N;
            if (!TextUtils.isEmpty(c1117Uu.f3646q)) {
                charSequence2 = this.f263C.f3646q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence2);
            sb.append(", ");
            C1773hL c1773hL2 = this.f269K;
            if (c1773hL2.isVisible()) {
                C1971l4 c1971l4 = c1773hL2.f5583q;
                C0053B2 c0053b2 = c1971l4.f6102h;
                charSequence = c0053b2.f216U;
                if (charSequence != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    CharSequence charSequence3 = c0053b2.f211J;
                    if (charSequence3 != null) {
                        charSequence = charSequence3;
                    }
                } else if (c1773hL2.m3300Q()) {
                    if (c1971l4.f6102h.f209H != 0 && (context = (Context) c1773hL2.f5578S.get()) != null) {
                        int i = c1773hL2.f5587y;
                        C0053B2 c0053b22 = c1971l4.f6102h;
                        if (i != -2) {
                            int m3299P = c1773hL2.m3299P();
                            int i2 = c1773hL2.f5587y;
                            if (m3299P > i2) {
                                charSequence = context.getString(c0053b22.f222e, Integer.valueOf(i2));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(c0053b22.f209H, c1773hL2.m3299P(), Integer.valueOf(c1773hL2.m3299P()));
                    }
                } else {
                    charSequence = c1971l4.f6102h.f220c;
                }
                sb.append((Object) charSequence);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            charSequence = null;
            sb.append((Object) charSequence);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i3 = 0;
        for (int i4 = 0; i4 < indexOfChild; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof C0065BH) && childAt.getVisibility() == 0) {
                i3++;
            }
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0963S3.m2147z(0, 1, i3, 1, isSelected()).f3274z);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C1862j5.f5822N.f5831z);
        }
        AbstractC2734zd.m4662v(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    /* renamed from: h */
    public final void m123h(float f, float f2) {
        this.f280g = f - f2;
        this.f292y = (f2 * 1.0f) / f;
        this.f288s = (f * 1.0f) / f2;
    }

    /* renamed from: k */
    public final void m124k(int i) {
        this.f265F = i;
        TextView textView = this.f278e;
        m109g(textView, i);
        m123h(this.f266H.getTextSize(), textView.getTextSize());
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: o */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1117Uu c1117Uu = this.f263C;
        if (c1117Uu != null && c1117Uu.isCheckable() && this.f263C.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f259D);
        }
        return onCreateDrawableState;
    }

    /* renamed from: q */
    public final void m126q(int i) {
        boolean z;
        C1219Wm c1219Wm;
        if (this.f275U != i) {
            this.f275U = i;
            if (this.f289t && i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c1219Wm = f260l;
            } else {
                c1219Wm = f261m;
            }
            this.f277d = c1219Wm;
            m111E(getWidth());
            m114M();
        }
    }

    @Override // android.view.View
    /* renamed from: u */
    public final int getSuggestedMinimumWidth() {
        int minimumWidth;
        ViewGroup viewGroup = this.f276c;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int measuredWidth = viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        C1773hL c1773hL = this.f269K;
        if (c1773hL == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c1773hL.getMinimumWidth() - this.f269K.f5583q.f6102h.f229p.intValue();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m115N().getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams2.rightMargin) + this.f268J.getMeasuredWidth() + Math.max(minimumWidth, layoutParams2.leftMargin), measuredWidth);
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: v */
    public final C1117Uu mo128v() {
        return this.f263C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c4, code lost:
    
        if (r13 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cd, code lost:
    
        if (r13 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00da, code lost:
    
        if (r13 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00dc, code lost:
    
        m110s(r2, r3, 49);
        m108f(r10, r12.f286q);
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e8, code lost:
    
        m110s(r2, r3, 17);
        m108f(r10, 0);
        r0.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f1, code lost:
    
        r1.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fa, code lost:
    
        if (r13 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fc, code lost:
    
        m110s(m115N(), (int) (r12.f267I + r12.f280g), 49);
        r0.setScaleX(1.0f);
        r0.setScaleY(1.0f);
        r0.setVisibility(0);
        r0 = r12.f292y;
        r1.setScaleX(r0);
        r1.setScaleY(r0);
        r1.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011f, code lost:
    
        m110s(m115N(), r12.f267I, 49);
        r2 = r12.f288s;
        r0.setScaleX(r2);
        r0.setScaleY(r2);
        r0.setVisibility(4);
        r1.setScaleX(1.0f);
        r1.setScaleY(1.0f);
        r1.setVisibility(0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m129w(boolean r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0065BH.m129w(boolean):void");
    }

    /* renamed from: y */
    public final void m130y(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f266H.setTextColor(colorStateList);
            this.f278e.setTextColor(colorStateList);
        }
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: z */
    public final void mo131z(C1117Uu c1117Uu) {
        CharSequence charSequence;
        int i;
        this.f263C = c1117Uu;
        c1117Uu.getClass();
        refreshDrawableState();
        m129w(c1117Uu.isChecked());
        setEnabled(c1117Uu.isEnabled());
        Drawable icon = c1117Uu.getIcon();
        if (icon != this.f282j) {
            this.f282j = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.f270L = icon;
                ColorStateList colorStateList = this.f285p;
                if (colorStateList != null) {
                    AbstractC0235ET.m478o(icon, colorStateList);
                }
            }
            this.f268J.setImageDrawable(icon);
        }
        CharSequence charSequence2 = c1117Uu.f3631N;
        this.f266H.setText(charSequence2);
        this.f278e.setText(charSequence2);
        C1117Uu c1117Uu2 = this.f263C;
        if (c1117Uu2 == null || TextUtils.isEmpty(c1117Uu2.f3646q)) {
            setContentDescription(charSequence2);
        }
        C1117Uu c1117Uu3 = this.f263C;
        if (c1117Uu3 != null && !TextUtils.isEmpty(c1117Uu3.f3644k)) {
            charSequence2 = this.f263C.f3644k;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 23) {
            AbstractC1843ih.m3411Ha(this, charSequence2);
        }
        setId(c1117Uu.f3653z);
        if (!TextUtils.isEmpty(c1117Uu.f3646q)) {
            setContentDescription(c1117Uu.f3646q);
        }
        if (!TextUtils.isEmpty(c1117Uu.f3644k)) {
            charSequence = c1117Uu.f3644k;
        } else {
            charSequence = c1117Uu.f3631N;
        }
        if (i2 > 23) {
            AbstractC1843ih.m3411Ha(this, charSequence);
        }
        if (c1117Uu.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        this.f273S = true;
    }
}
