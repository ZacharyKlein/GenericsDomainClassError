package com.ociweb

import com.ociweb.industry.Industry
import com.ociweb.settings.WidgetSetting

class UberWidget<SettingType extends WidgetSetting, AreaType extends Industry> {
    SettingType setting
    AreaType area
}