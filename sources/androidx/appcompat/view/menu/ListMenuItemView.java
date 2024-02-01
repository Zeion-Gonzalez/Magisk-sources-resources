package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0483J5;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C1117Uu;
import p000a.C2709z9;
import p000a.InterfaceC0157D3;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0157D3, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: E */
    public final int f8683E;

    /* renamed from: H */
    public LayoutInflater f8684H;

    /* renamed from: I */
    public TextView f8685I;

    /* renamed from: J */
    public final Drawable f8686J;

    /* renamed from: R */
    public ImageView f8687R;

    /* renamed from: S */
    public C1117Uu f8688S;

    /* renamed from: U */
    public final Drawable f8689U;

    /* renamed from: c */
    public final boolean f8690c;

    /* renamed from: e */
    public boolean f8691e;

    /* renamed from: f */
    public final Context f8692f;

    /* renamed from: g */
    public ImageView f8693g;

    /* renamed from: k */
    public TextView f8694k;

    /* renamed from: q */
    public CheckBox f8695q;

    /* renamed from: r */
    public boolean f8696r;

    /* renamed from: s */
    public LinearLayout f8697s;

    /* renamed from: w */
    public RadioButton f8698w;

    /* renamed from: y */
    public ImageView f8699y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2709z9 m4639S = C2709z9.m4639S(getContext(), attributeSet, AbstractC0483J5.f1617k, R.attr.listMenuViewStyle);
        this.f8689U = m4639S.m4642N(5);
        this.f8683E = m4639S.m4646W(1, -1);
        this.f8696r = m4639S.m4652z(7, false);
        this.f8692f = context;
        this.f8686J = m4639S.m4642N(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f8690c = obtainStyledAttributes.hasValue(0);
        m4639S.m4651w();
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8699y;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8699y.getLayoutParams();
        rect.top = this.f8699y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* renamed from: h */
    public final LayoutInflater m4698h() {
        if (this.f8684H == null) {
            this.f8684H = LayoutInflater.from(getContext());
        }
        return this.f8684H;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, this.f8689U);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f8685I = textView;
        int i = this.f8683E;
        if (i != -1) {
            textView.setTextAppearance(this.f8692f, i);
        }
        this.f8694k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f8693g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8686J);
        }
        this.f8699y = (ImageView) findViewById(R.id.group_divider);
        this.f8697s = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f8687R != null && this.f8696r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8687R.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // p000a.InterfaceC0157D3
    /* renamed from: v */
    public final C1117Uu mo128v() {
        return this.f8688S;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x022b  */
    @Override // p000a.InterfaceC0157D3
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo131z(p000a.C1117Uu r13) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo131z(a.Uu):void");
    }
}
