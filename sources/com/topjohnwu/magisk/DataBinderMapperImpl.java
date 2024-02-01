package com.topjohnwu.magisk;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC2760z;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC2441tz;
import p000a.AbstractC2479uk;
import p000a.C0002A2;
import p000a.C0028AW;
import p000a.C0029Aa;
import p000a.C0210E0;
import p000a.C0400Hc;
import p000a.C0486J9;
import p000a.C0535K4;
import p000a.C0584Kw;
import p000a.C0706NK;
import p000a.C0779OV;
import p000a.C0811P7;
import p000a.C1107Uk;
import p000a.C1141VL;
import p000a.C1240X9;
import p000a.C1258XZ;
import p000a.C1307YU;
import p000a.C1358ZP;
import p000a.C1393a7;
import p000a.C1414aZ;
import p000a.C1510cS;
import p000a.C1601e9;
import p000a.C1660fD;
import p000a.C1876jL;
import p000a.C1889jZ;
import p000a.C1905jr;
import p000a.C1915k1;
import p000a.C1976l9;
import p000a.C2011lp;
import p000a.C2028mB;
import p000a.C2057ml;
import p000a.C2130oB;
import p000a.C2149oX;
import p000a.C2336rx;
import p000a.C2544vt;
import p000a.C2672yS;
import p000a.C2705z5;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC2479uk {

    /* renamed from: z */
    public static final SparseIntArray f9562z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(36);
        f9562z = sparseIntArray;
        sparseIntArray.put(R.layout.activity_main_md2, 1);
        sparseIntArray.put(R.layout.activity_request, 2);
        sparseIntArray.put(R.layout.dialog_magisk_base, 3);
        sparseIntArray.put(R.layout.dialog_settings_app_name, 4);
        sparseIntArray.put(R.layout.dialog_settings_download_path, 5);
        sparseIntArray.put(R.layout.dialog_settings_update_channel, 6);
        sparseIntArray.put(R.layout.fragment_deny_md2, 7);
        sparseIntArray.put(R.layout.fragment_flash_md2, 8);
        sparseIntArray.put(R.layout.fragment_home_md2, 9);
        sparseIntArray.put(R.layout.fragment_install_md2, 10);
        sparseIntArray.put(R.layout.fragment_log_md2, 11);
        sparseIntArray.put(R.layout.fragment_module_md2, 12);
        sparseIntArray.put(R.layout.fragment_settings_md2, 13);
        sparseIntArray.put(R.layout.fragment_superuser_md2, 14);
        sparseIntArray.put(R.layout.fragment_theme_md2, 15);
        sparseIntArray.put(R.layout.include_home_magisk, 16);
        sparseIntArray.put(R.layout.include_home_manager, 17);
        sparseIntArray.put(R.layout.include_log_magisk, 18);
        sparseIntArray.put(R.layout.include_log_superuser, 19);
        sparseIntArray.put(R.layout.item_console_md2, 20);
        sparseIntArray.put(R.layout.item_developer, 21);
        sparseIntArray.put(R.layout.item_hide_md2, 22);
        sparseIntArray.put(R.layout.item_hide_process_md2, 23);
        sparseIntArray.put(R.layout.item_icon_link, 24);
        sparseIntArray.put(R.layout.item_list_single_line, 25);
        sparseIntArray.put(R.layout.item_log_access_md2, 26);
        sparseIntArray.put(R.layout.item_log_textview, 27);
        sparseIntArray.put(R.layout.item_log_track_md2, 28);
        sparseIntArray.put(R.layout.item_module_download, 29);
        sparseIntArray.put(R.layout.item_module_md2, 30);
        sparseIntArray.put(R.layout.item_policy_md2, 31);
        sparseIntArray.put(R.layout.item_settings, 32);
        sparseIntArray.put(R.layout.item_settings_section, 33);
        sparseIntArray.put(R.layout.item_tappable_headline, 34);
        sparseIntArray.put(R.layout.item_text, 35);
        sparseIntArray.put(R.layout.item_theme, 36);
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: h */
    public final AbstractC2760z mo4253h(View view, int i) {
        int i2 = f9562z.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/activity_main_md2_0".equals(tag)) {
                            return new C1258XZ(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for activity_main_md2 is invalid. Received: ", tag));
                    case 2:
                        if ("layout/activity_request_0".equals(tag)) {
                            return new C1240X9(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for activity_request is invalid. Received: ", tag));
                    case 3:
                        if ("layout/dialog_magisk_base_0".equals(tag)) {
                            return new C1905jr(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for dialog_magisk_base is invalid. Received: ", tag));
                    case 4:
                        if ("layout/dialog_settings_app_name_0".equals(tag)) {
                            return new C0210E0(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for dialog_settings_app_name is invalid. Received: ", tag));
                    case 5:
                        if ("layout/dialog_settings_download_path_0".equals(tag)) {
                            return new C2011lp(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for dialog_settings_download_path is invalid. Received: ", tag));
                    case 6:
                        if ("layout/dialog_settings_update_channel_0".equals(tag)) {
                            return new C2336rx(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for dialog_settings_update_channel is invalid. Received: ", tag));
                    case 7:
                        if ("layout/fragment_deny_md2_0".equals(tag)) {
                            return new C0811P7(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_deny_md2 is invalid. Received: ", tag));
                    case 8:
                        if ("layout/fragment_flash_md2_0".equals(tag)) {
                            return new C1601e9(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_flash_md2 is invalid. Received: ", tag));
                    case 9:
                        if ("layout/fragment_home_md2_0".equals(tag)) {
                            return new C2028mB(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_home_md2 is invalid. Received: ", tag));
                    case 10:
                        if ("layout/fragment_install_md2_0".equals(tag)) {
                            return new C2672yS(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_install_md2 is invalid. Received: ", tag));
                    case 11:
                        if ("layout/fragment_log_md2_0".equals(tag)) {
                            return new C1660fD(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_log_md2 is invalid. Received: ", tag));
                    case 12:
                        if ("layout/fragment_module_md2_0".equals(tag)) {
                            return new C1107Uk(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_module_md2 is invalid. Received: ", tag));
                    case 13:
                        if ("layout/fragment_settings_md2_0".equals(tag)) {
                            return new C1915k1(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_settings_md2 is invalid. Received: ", tag));
                    case 14:
                        if ("layout/fragment_superuser_md2_0".equals(tag)) {
                            return new C1876jL(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_superuser_md2 is invalid. Received: ", tag));
                    case 15:
                        if ("layout/fragment_theme_md2_0".equals(tag)) {
                            return new C1976l9(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for fragment_theme_md2 is invalid. Received: ", tag));
                    case 16:
                        if ("layout/include_home_magisk_0".equals(tag)) {
                            return new C0029Aa(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for include_home_magisk is invalid. Received: ", tag));
                    case 17:
                        if ("layout/include_home_manager_0".equals(tag)) {
                            return new C1889jZ(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for include_home_manager is invalid. Received: ", tag));
                    case 18:
                        if ("layout/include_log_magisk_0".equals(tag)) {
                            return new C1393a7(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for include_log_magisk is invalid. Received: ", tag));
                    case 19:
                        if ("layout/include_log_superuser_0".equals(tag)) {
                            return new C2130oB(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for include_log_superuser is invalid. Received: ", tag));
                    case 20:
                        if ("layout/item_console_md2_0".equals(tag)) {
                            return new C0486J9(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_console_md2 is invalid. Received: ", tag));
                    case 21:
                        if ("layout/item_developer_0".equals(tag)) {
                            return new C2544vt(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_developer is invalid. Received: ", tag));
                    case 22:
                        if ("layout/item_hide_md2_0".equals(tag)) {
                            return new C0028AW(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_hide_md2 is invalid. Received: ", tag));
                    case 23:
                        if ("layout/item_hide_process_md2_0".equals(tag)) {
                            return new C0400Hc(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_hide_process_md2 is invalid. Received: ", tag));
                    case 24:
                        if ("layout/item_icon_link_0".equals(tag)) {
                            return new C1414aZ(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_icon_link is invalid. Received: ", tag));
                    case 25:
                        if ("layout/item_list_single_line_0".equals(tag)) {
                            return new C1510cS(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_list_single_line is invalid. Received: ", tag));
                    case 26:
                        if ("layout/item_log_access_md2_0".equals(tag)) {
                            return new C2705z5(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_log_access_md2 is invalid. Received: ", tag));
                    case 27:
                        if ("layout/item_log_textview_0".equals(tag)) {
                            return new C2057ml(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_log_textview is invalid. Received: ", tag));
                    case 28:
                        if ("layout/item_log_track_md2_0".equals(tag)) {
                            return new C1141VL(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_log_track_md2 is invalid. Received: ", tag));
                    case 29:
                        if ("layout/item_module_download_0".equals(tag)) {
                            return new C0779OV(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_module_download is invalid. Received: ", tag));
                    case 30:
                        if ("layout/item_module_md2_0".equals(tag)) {
                            return new C0706NK(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_module_md2 is invalid. Received: ", tag));
                    case 31:
                        if ("layout/item_policy_md2_0".equals(tag)) {
                            return new C2149oX(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_policy_md2 is invalid. Received: ", tag));
                    case 32:
                        if ("layout/item_settings_0".equals(tag)) {
                            return new C0535K4(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_settings is invalid. Received: ", tag));
                    case 33:
                        if ("layout/item_settings_section_0".equals(tag)) {
                            return new C0584Kw(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_settings_section is invalid. Received: ", tag));
                    case 34:
                        if ("layout/item_tappable_headline_0".equals(tag)) {
                            return new C0002A2(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_tappable_headline is invalid. Received: ", tag));
                    case 35:
                        if ("layout/item_text_0".equals(tag)) {
                            return new C1358ZP(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_text is invalid. Received: ", tag));
                    case 36:
                        if ("layout/item_theme_0".equals(tag)) {
                            return new C1307YU(view);
                        }
                        throw new IllegalArgumentException(AbstractC2441tz.m4201o("The tag for item_theme is invalid. Received: ", tag));
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: v */
    public final AbstractC2760z mo4254v(View[] viewArr, int i) {
        if (viewArr.length != 0 && f9562z.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: z */
    public final List mo4255z() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }
}
