/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csg;

/**
 *
 * @author zhengyu
 */
public enum CourseSitePropertyType {
    // TABS
    CSG_SITE, 
    CSG_SYLLABUS,
    CSG_MEETING,
    CSG_OH,
    CSG_SCHEDULE,
    CSG_GRID_PANE,
    CSG_SCROLL_PANE,
    CSG_FOOLPROOF_SETTINGS,
    // SITE TAB 
    SITE_BANNER_BOX,
    SITE_PAGE_BOX,
    SITE_STYLE_BOX,
    SITE_INSTRUCTOR_BOX,
    SITE_BANNER,
    SITE_SUBJECT,
    SITE_SUBJECT_COMBO_BOX,
    SITE_YEAR,
    SITE_YEAR_COMBO_BOX,
    SITE_SEMESTER,
    SITE_SEMESTER_COMBO_BOX,
    SITE_NUMBER,
    SITE_NUMBER_COMBO_BOX,
    SITE_TITLE,
    SITE_TITLE_TEXT_FIELD,
    SITE_EXPORT,
    SITE_EXPORT_DIR,
    SITE_PAGE,
    SITE_HOME,
    SITE_SYLLABUS,
    SITE_SCHEDULE,
    SITE_HWS,
    SITE_STYLE,
    SITE_FAVICON,
    SITE_NAVBAR,
    SITE_LEFT_FOOTER,
    SITE_RIGHT_FOOTER,
    SITE_FAVICON_IMG,
    SITE_NAVBAR_IMG,
    SITE_LEFT_FOOTER_IMG,
    SITE_RIGHT_FOOTER_IMG,
    SITE_CSS,
    SITE_CSS_COMBO_BOX,
    SITE_NOTE,
    SITE_INSTRUCTOR,
    SITE_INSTRUCTOR_NAME,
    SITE_INSTRUCTOR_NAME_TEXT_FIELD,
    SITE_INSTRUCTOR_ROOM,
    SITE_INSTRUCTOR_ROOM_TEXT_FIELD,
    SITE_INSTRUCTOR_EMAIL,
    SITE_INSTRUCTOR_EMAIL_TEXT_FIELD,
    SITE_INSTRUCTOR_HOMEPAGE,
    SITE_INSTRUCTOR_HOMEPAGE_TEXT_FIELD,
    SITE_INSTRUCTOR_OH,
    SITE_INSTRUCTOR_OH_TEXT_AREA,
    
    //SYLLABUS 
    SY_VBOX,
    SY_DESCRIPTION_TEXT_AREA,
    SY_TOPIC_TEXT_AREA,
    SY_PREREQUIREMENT_TEXT_AREA,
    SY_OUTCOMES_TEXT_AREA,
    SY_TEXTBOOK_TEXT_AREA,
    SY_GRADED_TEXT_AREA,
    SY_GRADING_TEXT_AREA,
    SY_ACADEMIC_TEXT_AREA,
    SY_SPECIAL_TEXT_AREA,
    SY_DESCRIPTION_TITLED_PANE,
    SY_TOPIC_TITLED_PANE,
    SY_PREREQUIREMENT_TITLED_PANE,
    SY_OUTCOMES_TITLED_PANE,
    SY_TEXTBOOK_TITLED_PANE,
    SY_GRADED_TITLED_PANE,
    SY_GRADING_TITLED_PANE,
    SY_ACADEMIC_TITLED_PANE,
    SY_SPECIAL_TITLED_PANE,
    
    //MEETING TIMES
    MT_VBOX,
    MT_ADD_LECTURE_BUTTON,
    MT_REMOVE_LECTURE_BUTTON,
    MT_LECTURE_LABEL,
    MT_LECTURE_TABLEVIEW,
    MT_LECTURE_SECTION_COLUMN,
    MT_LECTURE_DAYS_COLUMN,
    MT_LECTURE_TIME_COLUMN,
    MT_LECTURE_ROOM_COLUMN,
    MT_ADD_RECITATION_BUTTON,
    MT_REMOVE_RECITATION_BUTTON,
    MT_RECITATION_LABEL,
    MT_RECITATION_TABLEVIEW,
    MT_RECITATION_SECTION_COLUMN,
    MT_RECITATION_DAYSTIME_COLUMN,
    MT_RECITATION_ROOM_COLUMN,
    MT_RECITATION_TA1_COLUMN,
    MT_RECITATION_TA2_COLUMN,
    MT_ADD_LAB_BUTTON,
    MT_REMOVE_LAB_BUTTON,
    MT_LAB_LABEL,
    MT_LAB_TABLEVIEW,
    MT_LAB_SECTION_COLUMN,
    MT_LAB_DAYSTIME_COLUMN,
    MT_LAB_ROOM_COLUMN,
    MT_LAB_TA1_COLUMN,
    MT_LAB_TA2_COLUMN,
    //OH VARIABLES
    OH_BOX,
    OH_TA_BOX,
    OH_OFFICE_HOURS_BOX,
    OH_TAS_TOGGLE,
    OH_TAS_HEADER_LABEL,
    OH_TAS_HEADER_TEXT_FIELD,
    OH_TAS_TABLE_VIEW,
    OH_NAME_TABLE_COLUMN,
    OH_EMAIL_TABLE_COLUMN,
    OH_SLOTS_TABLE_COLUMN,
    OH_TYPE_TABLE_COLUMN,
    
    OH_OFFICE_HOURS_HEADER_BOX,
    OH_OFFICE_HOURS_HEADER_LABEL,
    OH_OFFICE_HOURS_TABLE_VIEW,
    OH_START_TIME_TABLE_COLUMN,
    OH_END_TIME_TABLE_COLUMN,
    OH_MONDAY_TABLE_COLUMN,
    OH_TUESDAY_TABLE_COLUMN,
    OH_WEDNESDAY_TABLE_COLUMN,
    OH_THURSDAY_TABLE_COLUMN,
    OH_FRIDAY_TABLE_COLUMN,
    OH_DAYS_OF_WEEK,
    OH_FOOLPROOF_SETTINGS,
    OH_START_TIME_LABLE,
    OH_END_TIME_LABLE,
    OH_START_TIME_COMBO_BOX,
    OH_END_TIME_COMBO_BOX,
    
    OH_MISSING_TA_NAME_TITLE_LABEL,
    OH_MISSING_TA_NAME_MESSAGE,
    
    OH_NAME_TEXT_FIELD,
    OH_EMAIL_TEXT_FIELD,
    OH_ADD_TA_BUTTON,
    OH_REMOVE_TA_BUTTON,
    OH_TOGGLE_ALL,
    OH_TOGGLE_UNDERGRADUATE,
    OH_TOGGLE_GRADUATE,
    OH_EDIT_TA_TITLE,OH_EDIT_TA_TEXT,
    OH_EDIT_TA_TYPE,OH_NAME_TABLE_COLUMN_TEXT,OH_EMAIL_TABLE_COLUMN_TEXT,
    OH_EMAIL_ERROR_TEXT,OH_NAME_ERROR_TEXT,
    
    OH_TOGGLE_UNDERGRADUATE_TEXT,
    OH_TOGGLE_GRADUATE_TEXT,
    

    //SCHEDULE 
    SC_VBOX,
    SC_CALENDAR_LABEL,
    SC_START_DATE_LABEL,
    SC_END_DATE_LABEL,
    SC_START_DATE_DATE_PICKER,
    SC_END_DATE_DATE_PICKER,
    SC_SCHEDULE_ITEM_LABEL,
    SC_REMOVE_ITEM_BUTTON,
    SC_SCHEDULE_TABLEVIEW,
    SC_SCHEDULE_TYPE_COLUMN,
    SC_SCHEDULE_DATE_COLUMN,
    SC_SCHEDULE_TITLE_COLUMN,
    SC_SCHEDULE_TOPIC_COLUMN,
    SC_ADD_LABEL,
    SC_TYPE_LABEL,
    SC_DATE_LABEL,
    SC_TITLE_LABEL,
    SC_TOPIC_LABEL,
    SC_LINK_LABEL,
    SC_TYPE_COMBO_BOX,
    SC_DATE_DATE_PICKER,
    SC_TITLE_TEXT_FIELD,
    SC_TOPIC_TEXT_FIELD,
    SC_LINK_TEXT_FIELD,
    SC_ADD_ITEM_BUTTON,
    SC_CLEAR_ITEM_BUTTON,
    
    
}