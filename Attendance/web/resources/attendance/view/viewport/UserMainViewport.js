Ext.define('Attendance.view.viewport.UserMainViewport', {
    extend: 'Ext.container.Viewport',
    id: 'userMainViewport',
    layout: {
        type: 'border'
    },
    
    
   createWindow: function(extComponent, title, height, width){
        extComponent.region = 'center';
        var win;
        if(!win){
            win = Ext.create('widget.window',{
                title: title,
                layout: 'border',
                closeAction: 'destroy',
                items:[extComponent],
                autoHeight: true,
                width: width,
                modal: true,
                //minimizable: true,
                //maximizable: true,
                closable:true,
                //collapsible:true,
                //animCollapse: true,
                //maximized: true,
                listeners: {
                    maximize: function(){
                        var viewportHeight = Ext.getCmp('userMainViewport').height;
                        //Ext.Msg.alert('Message',viewportHeight);
                        win.setHeight(viewportHeight);
                        win.doLayout();
                    }
                }
            })
            win.show(this, function(){

            });
        }
    },

    
    showComponent: function(component){
        component.closable = true;
        var tabContainer = Ext.getCmp('centerTabPanel');
        tabContainer.add(component);
        tabContainer.setActiveTab(component);
    },
    
    createMenuTree : function(){
        var tree = Ext.create('Ext.tree.Panel', {
            id:'menuTree',
            title: 'Menu',
            rootVisible:true,
            lines:false,
            height: '50%',
            split:true,
            collapsible: true,
            animCollapse: true,
            autoScroll:true,
            store: Ext.create('Attendance.data.store.MenuStore'),
            listeners:{
                itemclick: function(view,rec,item,index,eventObj){
                    var component = null;
                    var viewport = Ext.getCmp('userMainViewport');
                    
                    if(rec.get('id') == 1){
                         component = Ext.create('Attendance.view.timing.TimingDefinition',{
                            closable: true
                        });
                    }
                    if(rec.get('id') == 2){
                        component = Ext.create('Attendance.view.designation.Designation',{
                            title: 'Designation',
                            closable: true
                        });
                    }
                    if(rec.get('id') == 3){
                        component = Ext.create('Attendance.view.workstation.Workstation',{
                            title: 'Workstation',
                            closable: true
                        });
                    }
                    if(rec.get('id') == 4){
                        component = Ext.create('Attendance.view.employee.EmployeeInfo',{
                            title: 'Employee Information',
                            closable: true
                        });
                    }
                    if(rec.get('id') == 5){
                       var loginForm = Ext.create('Attendance.view.login.LoginForm',{
                        });
                        viewport.createWindow(loginForm, 'Login for TimeIn', 200, 400);
                    }
                    if(rec.get('id') == 6){
                       var logoutForm = Ext.create('Attendance.view.login.LoginForm',{
                        });
                        viewport.createWindow(logoutForm, 'Login for TimeOut', 200, 400);
                    }
                    if(rec.get('id') == 7){
                        component = Ext.create('Attendance.view.reason.Reason',{
                            title: 'Reason',
                            height: '100%',
                            closable: true
                        });
                    }
                    //show component in center panel
                    var tabContainer = Ext.getCmp('centerTabPanel');
                    tabContainer.add(component);
                    tabContainer.setActiveTab(component);
                }
            }
        });

        return tree;
    },
    
    
    createUserTree : function(){
        var tree = Ext.create('Ext.tree.Panel', {
            id:'UserTree',
            title: 'Online Users',
            rootVisible:false,
            lines:false,
            height: '50%',
            collapsible: true,
            animCollapse: true,
            autoScroll:true,
            store: Ext.create('Ext.data.TreeStore', {
                root: {
                    text:'Online',
                    expanded: true,
                    children:[{
                        text:'Online Users',
                        iconCls: 'folderIcon',
                        expanded:false,
                        children:[
                            { text:'Shekhar', iconCls:'userIcon', leaf:true },
                            { text:'Sujeet', iconCls:'userIcon', leaf:true },
                            { text:'Manish', iconCls:'activeUserIcon', leaf:true },
                            { text:'Rajesh', iconCls:'userIcon', leaf:true },
                        ]
                    }
                    ]
                }
            })
        });

        return tree;
    },

    
    initComponent: function() {
        var me = this;
        
        function hello(){
            Ext.Msg.alert('Hello','Hello');
        }
        
        Ext.applyIf(me, {
            items: [
                {
                  xtype: 'panel',
                  width: 200,
                  region: 'west',
                  split: true,
                  items: [
                            me.createMenuTree(),
                            me.createUserTree(),
                      ]
                },
                {
                    xtype: 'panel',
                    height: 30,
                    region: 'north',
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            items: [
                                {
                                    xtype: 'button',
                                    text: 'shekharkumargupta@gmail.com',
                                    iconCls: 'activeUserIcon'
                                },
                                {
                                    xtype: 'tbfill'
                                },
                                {
                                    xtype: 'button',
                                    text: 'Logout',
                                    iconCls: 'logoutIcon'
                                }
                            ]
                        }
                    ]
                },
                {
                    xtype: 'tabpanel',
                    id: 'centerTabPanel',
                    activeTab: 0,
                    region: 'center',
                    items: []
                },
                {
                    xtype: 'panel',
                    height: 80,
                    collapsible: true,
                    title: 'My Panel',
                    titleCollapse: true,
                    region: 'south',
                    split: true
                }
            ]
        });

        me.callParent(arguments);
    }
});