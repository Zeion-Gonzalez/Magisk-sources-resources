package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.topjohnwu.magisk.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a.ZX */
/* loaded from: classes.dex */
public final class C1364ZX {

    /* renamed from: N */
    public final Object f4276N;

    /* renamed from: P */
    public final Object f4277P;

    /* renamed from: Q */
    public final Object f4278Q;

    /* renamed from: h */
    public final Object f4279h;

    /* renamed from: u */
    public Object f4280u;

    /* renamed from: v */
    public final Serializable f4281v;

    /* renamed from: z */
    public final /* synthetic */ int f4282z;

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    public C1364ZX() {
        this.f4282z = 0;
        this.f4279h = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f4281v = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f4277P = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f4276N = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f4278Q = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f4280u = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    /* renamed from: Q */
    public static void m2757Q(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = AbstractC1888jY.f5902z;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1982lH.f6149h;
        }
        mutate.setColorFilter(C1982lH.m3596v(i, mode));
    }

    /* renamed from: v */
    public static ColorStateList m2758v(Context context, int i) {
        int m3288v = AbstractC1757h0.m3288v(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1757h0.f5549h, AbstractC1757h0.f5547P, AbstractC1757h0.f5551v, AbstractC1757h0.f5548Q}, new int[]{AbstractC1757h0.m3287h(context, R.attr.colorButtonNormal), AbstractC0106C4.m228h(m3288v, i), AbstractC0106C4.m228h(m3288v, i), i});
    }

    /* renamed from: z */
    public static boolean m2759z(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public final String m2760N(String str) {
        return ((C1494c7) this.f4277P).m2897h(str);
    }

    /* renamed from: P */
    public final ColorStateList m2761P(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0865QC.m1999h(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0865QC.m1999h(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList m3286P = AbstractC1757h0.m3286P(context, R.attr.colorSwitchThumbNormal);
            if (m3286P != null && m3286P.isStateful()) {
                int[] iArr3 = AbstractC1757h0.f5549h;
                iArr[0] = iArr3;
                iArr2[0] = m3286P.getColorForState(iArr3, 0);
                iArr[1] = AbstractC1757h0.f5546N;
                iArr2[1] = AbstractC1757h0.m3288v(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1757h0.f5548Q;
                iArr2[2] = m3286P.getDefaultColor();
            } else {
                iArr[0] = AbstractC1757h0.f5549h;
                iArr2[0] = AbstractC1757h0.m3287h(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = AbstractC1757h0.f5546N;
                iArr2[1] = AbstractC1757h0.m3288v(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1757h0.f5548Q;
                iArr2[2] = AbstractC1757h0.m3288v(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return m2758v(context, AbstractC1757h0.m3288v(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return m2758v(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return m2758v(context, AbstractC1757h0.m3288v(context, R.attr.colorAccent));
        }
        if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
            if (m2759z((int[]) this.f4281v, i)) {
                return AbstractC1757h0.m3286P(context, R.attr.colorControlNormal);
            }
            if (m2759z((int[]) this.f4278Q, i)) {
                return AbstractC0865QC.m1999h(context, R.color.abc_tint_default);
            }
            if (m2759z((int[]) this.f4280u, i)) {
                return AbstractC0865QC.m1999h(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0865QC.m1999h(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return AbstractC0865QC.m1999h(context, R.color.abc_tint_spinner);
    }

    /* renamed from: h */
    public final C1755gz m2762h() {
        C1755gz c1755gz = (C1755gz) this.f4280u;
        if (c1755gz != null) {
            return c1755gz;
        }
        int i = C1755gz.f5531R;
        C1755gz m95N = C0054B3.m95N((C1494c7) this.f4277P);
        this.f4280u = m95N;
        return m95N;
    }

    public final String toString() {
        switch (this.f4282z) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f4281v);
                sb.append(", url=");
                sb.append((C2658y7) this.f4279h);
                C1494c7 c1494c7 = (C1494c7) this.f4277P;
                if (c1494c7.f4637S.length / 2 != 0) {
                    sb.append(", headers=[");
                    Iterator it = c1494c7.iterator();
                    int i = 0;
                    while (true) {
                        C2098nX c2098nX = (C2098nX) it;
                        if (c2098nX.hasNext()) {
                            Object next = c2098nX.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                C0084Bc c0084Bc = (C0084Bc) next;
                                String str = (String) c0084Bc.f329S;
                                String str2 = (String) c0084Bc.f328R;
                                if (i > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                                sb.append(':');
                                sb.append(str2);
                                i = i2;
                            } else {
                                AbstractC1292YB.m2699zx();
                                throw null;
                            }
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f4278Q;
                if ((!map.isEmpty()) != false) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1364ZX(C2658y7 c2658y7, String str, C1494c7 c1494c7, AbstractC1911jx abstractC1911jx, Map map) {
        this.f4282z = 1;
        this.f4279h = c2658y7;
        this.f4281v = str;
        this.f4277P = c1494c7;
        this.f4276N = abstractC1911jx;
        this.f4278Q = map;
    }
}
