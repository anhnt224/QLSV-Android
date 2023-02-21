/*
 * Copyright 2018-2019 Andrius Baruckis www.baruckis.com | mycryptocoins.baruckis.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emglab.qlsv.utilities

import com.google.android.gms.maps.model.LatLng

/**
 * Constants used throughout the app.
 */
const val DATABASE_NAME = "ictsv_database_version10"
const val SHARED_PREFERENCES_NAME = "shared_preferences_ctsv_version10"
const val AUTO = "auto"
const val VERSION_DB = 29
const val API_SERVICE_BASE_URL = "https://api.iuoss.com/iCTSVUI/"
const val API_SERVICE_FORM_BASE_URL = "https://api.iuoss.com/GiayToUI/"
const val API_TIMETABLE = "https://ctsv.hust.edu.vn/api-t/UploadFile/CTSV/"
const val API_SERVICE_RUN_URL = "https://api.iuoss.com/iCTSVUI/"
const val API_UPLOAD_SERVICE_BASE_URL = "https://api.iuoss.com/UploadFileUI"
const val API_MAP = "https://maps.vnpost.vn/addr-service/api/"
const val DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss"
const val DATE_FORMAT_PATTERN_DDMMYYYY = "dd-MM-yyyy"
const val DATE_FORMAT_PATTERN_ddMMHHmm = "HH:mm dd/MM"
val DEFAULT_LATLNG = LatLng(21.006937, 105.843061)
const val DEFAULT_CITY = "Thành phố Hà Nội"
const val KTX_BK_DISTRICT = "Quận Hai Bà Trưng"
const val KTX_BK_WARD = "Phường Bách Khoa"
val KTX_BK_LATLNG = LatLng(21.00603328814058,105.84679193794727)
const val KTX_PV_DISTRICT = "Quận Hoàng Mai"
const val KTX_PV_WARD = "Phường Hoàng Liệt"
val KTX_PV_LATLNG = LatLng(20.9594045,105.848033)

const val PENDING_COLOR = "#FFB300"
const val DONE_COLOR = "#43A047"
const val SECONDARY_TEXT_COLOR = "#99000000"
const val LIGHT_GRAY = "#D1D1D1"
const val ACTION_COLOR = "#216EF3"

const val NOTIFICATION_CHANNEL_ID = "RUN_SERVICE"
const val NOTIFICATION_CHANNEL_NAME = "RUN_SERVICE"