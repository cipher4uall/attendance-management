<%-- 
    Document   : home
    Created on : Dec 23, 2011, 10:03:17 PM
    Author     : Ramesh
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <title>OPGEA Welcome</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/attendance/css/clock.css" />" type="text/css" media="all"/>
        <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/ext-4.0/resources/css/ext-all.css" />" type="text/css" media="all"/>
        <script type="text/javascript" src="<spring:url value="/resources/ext-4.0/ext-all-debug.js"/>" ></script>


        <!--UI Imports-->
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/viewport/UserMainViewport.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/company/CompanyBasicInfo.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/timing/TimingDefinition.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/designation/Designation.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/workstation/Workstation.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/employee/EmployeeInfo.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/reason/Reason.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/view/login/LoginForm.js"/>"></script>

        <!--Store Imports-->
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/MenuStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/CountryStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/CityStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/DesignationStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/WorkstationStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/EmployeeStore.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/attendance/data/store/ReasonOfStore.js"/>"></script>
        
        <style type="text/css">
            .startMenuIcon{
                background-image: url(../images/om_start.jpg);
            }
            .userIcon{
                background-image: url(../images/user.gif);
            }
            .activeUserIcon{
                background-image: url(../images/user_green.gif);
            }
            .settingIcon{
                background-image: url(../images/gears.gif);
            }
            .logoutIcon{
                background-image: url(../images/icon_padlock.png);
            }
            .addIcon{
                background-image: url(../images/add.gif);
            }
            .removeIcon{
                background-image: url(../images/delete.gif);
            }
            .folderIcon{
                background-image: url(../images/folder_go.gif);
            }
            .monitorIcon{
                background-image: url(../images/monitor.gif);
            }
            .notepadIcon{
                background-image: url(../images/notepad.gif);
            }
            .bookIcon{
                background-image: url(../images/book.png);
            }
            .reasonIcon{
                background-image: url(../images/reason.gif);
            }
            .timeInIcon{
                background-image: url(../images/time_in.gif);
            }
            .timeOutIcon{
                background-image: url(../images/time_out.gif);
            }
            .tableRefreshIcon{
                background-image: url(../images/table_refresh.png);
            }
            
        </style>

        
        <script type="text/javascript">
            Ext.onReady(function(){
                Ext.create("Attendance.view.viewport.UserMainViewport",{
                    id: 'userMainViewport'
                });
                Ext.QuickTips.init();
                
            });
        </script>
    </head>
    <body>
        
    </body>
</html>
