package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.topjohnwu.magisk.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.AbstractC0207Dy;
import p000a.AbstractC0483J5;
import p000a.AbstractC1843ih;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0022AP;
import p000a.C1164Vn;
import p000a.C1182W7;
import p000a.C1750gu;
import p000a.C2070mz;
import p000a.C2227pz;
import p000a.C2492uy;
import p000a.C2518vN;
import p000a.C2644xr;
import p000a.C2709z9;
import p000a.InterfaceC1748gs;
import p000a.RunnableC1974l7;
import p000a.ViewOnFocusChangeListenerC0709NN;
import p000a.ViewOnLayoutChangeListenerC2329rp;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0207Dy implements InterfaceC1748gs {

    /* renamed from: n0 */
    public static final C2709z9 f8785n0;

    /* renamed from: B */
    public final ImageView f8786B;

    /* renamed from: C */
    public final View f8787C;

    /* renamed from: D */
    public final CharSequence f8788D;

    /* renamed from: F */
    public final View f8789F;

    /* renamed from: H */
    public final SearchAutoComplete f8790H;

    /* renamed from: HL */
    public String f8791HL;

    /* renamed from: K */
    public final Drawable f8792K;

    /* renamed from: L */
    public final ImageView f8793L;

    /* renamed from: O */
    public C2644xr f8794O;

    /* renamed from: T */
    public final int[] f8795T;

    /* renamed from: UZ */
    public final RunnableC1974l7 f8796UZ;

    /* renamed from: Yd */
    public boolean f8797Yd;

    /* renamed from: b */
    public boolean f8798b;

    /* renamed from: d */
    public final View f8799d;

    /* renamed from: e */
    public final View f8800e;

    /* renamed from: i */
    public final ImageView f8801i;

    /* renamed from: j */
    public final ImageView f8802j;

    /* renamed from: l */
    public boolean f8803l;

    /* renamed from: m */
    public C1182W7 f8804m;

    /* renamed from: n */
    public final Rect f8805n;

    /* renamed from: nF */
    public int f8806nF;

    /* renamed from: nP */
    public CharSequence f8807nP;

    /* renamed from: od */
    public boolean f8808od;

    /* renamed from: p */
    public final ImageView f8809p;

    /* renamed from: qn */
    public int f8810qn;

    /* renamed from: t */
    public final int[] f8811t;

    /* renamed from: x */
    public final Rect f8812x;

    /* renamed from: zx */
    public final RunnableC1974l7 f8813zx;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C2492uy {

        /* renamed from: g */
        public boolean f8814g;

        /* renamed from: k */
        public SearchView f8815k;

        /* renamed from: q */
        public int f8816q;

        /* renamed from: y */
        public final RunnableC2756P f8817y;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8817y = new RunnableC2756P(this);
            this.f8816q = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f8816q <= 0 || super.enoughToFilter();
        }

        @Override // p000a.C2492uy, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8814g) {
                RunnableC2756P runnableC2756P = this.f8817y;
                removeCallbacks(runnableC2756P);
                post(runnableC2756P);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            int i;
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                i = 256;
            } else if (i2 < 600 && (i2 < 640 || i3 < 480)) {
                i = 160;
            } else {
                i = 192;
            }
            setMinWidth((int) TypedValue.applyDimension(1, i, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f8815k;
            searchView.m4726g(searchView.f8798b);
            searchView.post(searchView.f8813zx);
            if (searchView.f8790H.hasFocus()) {
                searchView.m4725S();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8815k.clearFocus();
                        m4730z(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            boolean z2;
            super.onWindowFocusChanged(z);
            if (z && this.f8815k.hasFocus() && getVisibility() == 0) {
                this.f8814g = true;
                Context context = getContext();
                C2709z9 c2709z9 = SearchView.f8785n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC2758v.m4760h(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    C2709z9 c2709z92 = SearchView.f8785n0;
                    c2709z92.getClass();
                    C2709z9.m4638R();
                    Object obj = c2709z92.f8535v;
                    if (((Method) obj) != null) {
                        try {
                            ((Method) obj).invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.f8816q = i;
        }

        /* renamed from: z */
        public final void m4730z(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC2756P runnableC2756P = this.f8817y;
            if (!z) {
                this.f8814g = false;
                removeCallbacks(runnableC2756P);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8814g = true;
                    return;
                }
                this.f8814g = false;
                removeCallbacks(runnableC2756P);
                inputMethodManager.showSoftInput(this, 0);
            }
        }
    }

    static {
        f8785n0 = Build.VERSION.SDK_INT < 29 ? new C2709z9() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: I */
    public final void m4723I() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f8790H.getText());
        if (!z2 && (!this.f8803l || this.f8808od)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.f8793L;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // p000a.InterfaceC1748gs
    /* renamed from: P */
    public final void mo1323P() {
        SearchAutoComplete searchAutoComplete = this.f8790H;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        clearFocus();
        m4726g(true);
        searchAutoComplete.setImeOptions(this.f8806nF);
        this.f8808od = false;
    }

    /* renamed from: R */
    public final void m4724R() {
        SearchAutoComplete searchAutoComplete = this.f8790H;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.m4730z(true);
        } else if (this.f8803l) {
            clearFocus();
            m4726g(true);
        }
    }

    /* renamed from: S */
    public final void m4725S() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f8790H;
        if (i >= 29) {
            AbstractC2758v.m4761z(searchAutoComplete);
            return;
        }
        C2709z9 c2709z9 = f8785n0;
        c2709z9.getClass();
        C2709z9.m4638R();
        Object obj = c2709z9.f8536z;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c2709z9.getClass();
        C2709z9.m4638R();
        Object obj2 = c2709z9.f8534h;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f8797Yd = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f8790H;
        searchAutoComplete.clearFocus();
        searchAutoComplete.m4730z(false);
        this.f8797Yd = false;
    }

    /* renamed from: g */
    public final void m4726g(boolean z) {
        int i;
        int i2;
        this.f8798b = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        TextUtils.isEmpty(this.f8790H.getText());
        this.f8809p.setVisibility(i);
        this.f8802j.setVisibility(8);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f8800e.setVisibility(i2);
        ImageView imageView = this.f8786B;
        if (imageView.getDrawable() == null || this.f8803l) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        m4723I();
        this.f8801i.setVisibility(8);
        this.f8787C.setVisibility(8);
    }

    @Override // p000a.InterfaceC1748gs
    /* renamed from: h */
    public final void mo1324h() {
        if (this.f8808od) {
            return;
        }
        this.f8808od = true;
        SearchAutoComplete searchAutoComplete = this.f8790H;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f8806nF = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        m4726g(false);
        searchAutoComplete.requestFocus();
        searchAutoComplete.m4730z(true);
    }

    /* renamed from: k */
    public final void m4727k() {
        Drawable drawable;
        SpannableStringBuilder spannableStringBuilder = this.f8807nP;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = this.f8788D;
        }
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        boolean z = this.f8803l;
        SearchAutoComplete searchAutoComplete = this.f8790H;
        if (z && (drawable = this.f8792K) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("   ");
            spannableStringBuilder2.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder2.append(spannableStringBuilder);
            spannableStringBuilder = spannableStringBuilder2;
        }
        searchAutoComplete.setHint(spannableStringBuilder);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f8813zx);
        post(this.f8796UZ);
        super.onDetachedFromWindow();
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f8790H;
            int[] iArr = this.f8795T;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f8811t;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f8805n;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f8812x;
            rect2.set(i7, 0, i8, i9);
            C2644xr c2644xr = this.f8794O;
            if (c2644xr == null) {
                C2644xr c2644xr2 = new C2644xr(rect2, rect, searchAutoComplete);
                this.f8794O = c2644xr2;
                setTouchDelegate(c2644xr2);
            } else {
                c2644xr.f8248h.set(rect2);
                Rect rect3 = c2644xr.f8246P;
                rect3.set(rect2);
                int i10 = -c2644xr.f8245N;
                rect3.inset(i10, i10);
                c2644xr.f8249v.set(rect);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0020, code lost:
    
        if (r0 <= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    @Override // p000a.AbstractC0207Dy, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.f8798b
            if (r0 == 0) goto L8
            super.onMeasure(r5, r6)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            r1 = 2131165239(0x7f070037, float:1.794469E38)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L35
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1e
            goto L4a
        L1e:
            int r0 = r4.f8810qn
            if (r0 <= 0) goto L4a
            goto L46
        L23:
            int r5 = r4.f8810qn
            if (r5 <= 0) goto L28
            goto L4a
        L28:
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r1)
            goto L4a
        L35:
            int r0 = r4.f8810qn
            if (r0 <= 0) goto L3a
            goto L46
        L3a:
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
        L46:
            int r5 = java.lang.Math.min(r0, r5)
        L4a:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            r1 = 2131165238(0x7f070036, float:1.7944687E38)
            if (r0 == r2) goto L67
            if (r0 == 0) goto L5a
            goto L77
        L5a:
            android.content.Context r6 = r4.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelSize(r1)
            goto L77
        L67:
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            int r6 = java.lang.Math.min(r0, r6)
        L77:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2227pz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2227pz c2227pz = (C2227pz) parcelable;
        super.onRestoreInstanceState(c2227pz.f8021S);
        m4726g(c2227pz.f6849w);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2227pz c2227pz = new C2227pz(super.onSaveInstanceState());
        c2227pz.f6849w = this.f8798b;
        return c2227pz;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f8813zx);
    }

    /* renamed from: q */
    public final void m4728q() {
        int[] iArr = this.f8790H.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f8789F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8787C.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f8797Yd || !isFocusable()) {
            return false;
        }
        if (!this.f8798b) {
            boolean requestFocus = this.f8790H.requestFocus(i, rect);
            if (requestFocus) {
                m4726g(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    /* renamed from: w */
    public final void m4729w() {
        SearchAutoComplete searchAutoComplete = this.f8790H;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C1182W7 c1182w7 = this.f8804m;
            if (c1182w7 != null) {
                String charSequence = text.toString();
                C1164Vn c1164Vn = (C1164Vn) c1182w7.f3861z.f9599U8.getValue();
                if (charSequence == null) {
                    charSequence = "";
                }
                c1164Vn.f3791s = charSequence;
                c1164Vn.m2381k(charSequence);
                return;
            }
            searchAutoComplete.m4730z(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8805n = new Rect();
        this.f8812x = new Rect();
        this.f8795T = new int[2];
        this.f8811t = new int[2];
        this.f8813zx = new RunnableC1974l7(this, 0);
        int i2 = 1;
        this.f8796UZ = new RunnableC1974l7(this, i2);
        new WeakHashMap();
        ViewOnClickListenerC2759z viewOnClickListenerC2759z = new ViewOnClickListenerC2759z(this);
        ViewOnKeyListenerC2757h viewOnKeyListenerC2757h = new ViewOnKeyListenerC2757h(this);
        C2070mz c2070mz = new C2070mz(this);
        C0022AP c0022ap = new C0022AP(this);
        C2518vN c2518vN = new C2518vN(i2, this);
        C1750gu c1750gu = new C1750gu(this);
        int[] iArr = AbstractC0483J5.f1621s;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C2709z9 c2709z9 = new C2709z9(context, obtainStyledAttributes);
        AbstractC2446u3.m4215M(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(c2709z9.m4646W(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f8790H = searchAutoComplete;
        searchAutoComplete.f8815k = this;
        this.f8800e = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f8789F = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f8787C = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f8809p = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f8802j = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f8793L = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f8801i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f8786B = imageView5;
        AbstractC2397t8.m4127q(findViewById, c2709z9.m4642N(20));
        AbstractC2397t8.m4127q(findViewById2, c2709z9.m4642N(25));
        imageView.setImageDrawable(c2709z9.m4642N(23));
        imageView2.setImageDrawable(c2709z9.m4642N(15));
        imageView3.setImageDrawable(c2709z9.m4642N(12));
        imageView4.setImageDrawable(c2709z9.m4642N(28));
        imageView5.setImageDrawable(c2709z9.m4642N(23));
        this.f8792K = c2709z9.m4642N(22);
        AbstractC1843ih.m3411Ha(imageView, getResources().getString(R.string.abc_searchview_description_search));
        c2709z9.m4646W(26, R.layout.abc_search_dropdown_item_icons_2line);
        c2709z9.m4646W(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC2759z);
        imageView3.setOnClickListener(viewOnClickListenerC2759z);
        imageView2.setOnClickListener(viewOnClickListenerC2759z);
        imageView4.setOnClickListener(viewOnClickListenerC2759z);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC2759z);
        searchAutoComplete.addTextChangedListener(c1750gu);
        searchAutoComplete.setOnEditorActionListener(c2070mz);
        searchAutoComplete.setOnItemClickListener(c0022ap);
        searchAutoComplete.setOnItemSelectedListener(c2518vN);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC2757h);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0709NN(this));
        boolean m4652z = c2709z9.m4652z(18, true);
        if (this.f8803l != m4652z) {
            this.f8803l = m4652z;
            m4726g(m4652z);
            m4727k();
        }
        int m4643P = c2709z9.m4643P(2, -1);
        if (m4643P != -1) {
            this.f8810qn = m4643P;
            requestLayout();
        }
        this.f8788D = c2709z9.m4641M(14);
        this.f8807nP = c2709z9.m4641M(21);
        int m4648o = c2709z9.m4648o(6, -1);
        if (m4648o != -1) {
            searchAutoComplete.setImeOptions(m4648o);
        }
        int m4648o2 = c2709z9.m4648o(5, -1);
        if (m4648o2 != -1) {
            searchAutoComplete.setInputType(m4648o2);
        }
        setFocusable(c2709z9.m4652z(1, true));
        c2709z9.m4651w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8799d = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2329rp(this));
        }
        m4726g(this.f8803l);
        m4727k();
    }
}
