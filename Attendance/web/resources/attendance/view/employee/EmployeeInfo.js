Ext.define('Attendance.view.employee.EmployeeInfo', {
    extend: 'Ext.form.Panel',
    iconCls: 'userIcon',
    height: 450,
    padding: 0,
    layout: {
        type: 'border'
    },
    bodyPadding: '',
    title: '',

    initComponent: function() {
        var me = this;
        var employeeStore = Ext.create('Attendance.data.store.EmployeeStore');
        var destinationStore = Ext.create("Attendance.data.store.DesignationStore");

        
        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'panel',
                    margin: '',
                    padding: '',
                    bodyPadding: 10,
                    collapsible: true,
                    title: 'Employee/Associates Information',
                    titleCollapse: true,
                    region: 'west',
                    split: true,
                    items: [
                        {
                            xtype: 'fieldset',
                            padding: 5,
                            title: 'Basic Information',
                            items: [
                                {
                                    xtype: 'hidden',
                                    name: 'id'
                                },
                                {
                                    xtype: 'textfield',
                                    name: 'firstName',
                                    fieldLabel: 'First Name',
                                    labelAlign: 'right',
                                    anchor: '100%'
                                },
                                {
                                    xtype: 'textfield',
                                    name: 'middleInitial',
                                    fieldLabel: 'Middle Initial',
                                    labelAlign: 'right',
                                    anchor: '100%'
                                },
                                {
                                    xtype: 'textfield',
                                    name: 'lastName',
                                    fieldLabel: 'Last Name',
                                    labelAlign: 'right',
                                    anchor: '100%'
                                }
                            ]
                        },
                        {
                            xtype: 'fieldset',
                            padding: 5,
                            title: 'Company Profile',
                            items: [
                                {
                                    xtype: 'textfield',
                                    name: 'empCode',
                                    fieldLabel: 'Employee Code',
                                    labelAlign: 'right',
                                    msgTarget: 'side',
                                    anchor: '100%'
                                },
                                {
                                    xtype: 'combo',
                                    fieldLabel: 'Destination',
                                    labelAlign: 'right',
                                    //hiddenName: 'destinationId',
                                    name: 'destinationId',
                                    store: destinationStore,
                                    displayField: 'name',
                                    valueField: 'id',
                                    triggerAction: 'all',
                                    editable: false
                                }
                            ]
                        },
                        {
                            xtype: 'fieldset',
                            padding: 5,
                            title: 'Contact Information',
                            items: [
                                {
                                    xtype: 'textfield',
                                    name: 'emailId',
                                    fieldLabel: 'Email Id',
                                    labelAlign: 'right',
                                    msgTarget: 'side',
                                    anchor: '100%'
                                },
                                {
                                    xtype: 'textfield',
                                    name: 'phone1',
                                    fieldLabel: 'Phone1',
                                    labelAlign: 'right',
                                    msgTarget: 'side',
                                    anchor: '100%'
                                },
                                {
                                    xtype: 'textfield',
                                    name: 'phone2',
                                    fieldLabel: 'Phone2',
                                    labelAlign: 'right',
                                    msgTarget: 'side',
                                    anchor: '100%'
                                }
                            ]
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            id: 'personInfoTB',
                            dock: 'bottom',
                            layout: {
                                align: 'middle',
                                pack: 'end',
                                type: 'hbox'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    id: 'saveButton',
                                    text: 'Save',
                                    formBind: true,
                                        handler: function(){
                                            var form = this.up('form').getForm();
                                            if(form.isValid()){
                                                form.submit({
                                                   url: 'user/create',
                                                   method:'POST',
                                                   waitMsg: 'Processing...',
                                                   success: function(form, action){
                                                       Ext.Msg.alert('Success',action.result.data);
                                                       var store = Ext.getStore('employeeStore');
                                                       
                                                       store.load(function(records, operation, success) {
                                                        console.log('Employee created and loaded in list.');
                                                       });                                                       
                                                    },
                                                   failure: function(form, action){
                                                       if(action.failureType == Ext.form.Action.CLIENT_INVALID){
                                                           Ext.Msg.alert("Cannot Submit", "Some fields are still invalid! ");
                                                       }
                                                       if(action.failureType == Ext.form.Action.CONNECT_FAILURE){
                                                           Ext.Msg.alert("Failure","Server communication failure: "+
                                                           action.response.status+' '+action.response.statusText);
                                                       }
                                                       if(action.failuretype == Ext.form.Action.SERVER_INVALID){
                                                           Ext.Mst.alert("Warning", "action.result.errormsg");
                                                       }
                                                   }
                                                });
                                            }
                                        }
                                },
                                {
                                    xtype: 'tbseparator'
                                },
                                {
                                    xtype: 'button',
                                    id: 'resetButton',
                                    text: 'Reset',
                                    handler: function(){
                                        this.up('form').getForm().reset();
                                    }
                                }
                            ]
                        }
                    ]
                },
                {
                    xtype: 'panel',
                    title: 'Employee List',
                    region: 'center',
                    items: [
                        {
                            xtype: 'gridpanel',
                            title: '',
                            store: employeeStore,
                            columnLines: true,
                            height: '72%',
                            columns: [
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'id',
                                    text: 'Id'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'firstName',
                                    text: 'First Name'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'middleInitial',
                                    text: 'M.Initial'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'lastName',
                                    text: 'lastName'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'empCode',
                                    text: 'Emp Code'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'emailId',
                                    text: 'Email'
                                },
                                {
                                    xtype: 'gridcolumn',
                                    dataIndex: 'phone1',
                                    text: 'Phone1'
                                }
                            ],
                            viewConfig: {

                            },
                            listeners: {
                                selectionchange: function(model, records){
                                    if(records[0]){
                                        //Ext.getCmp('personInfo').getForm().loadRecord(records[0]);
                                        this.up('form').getForm().loadRecord(records[0]);
                                    }
                                }
                            }
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            items: [
                                {
                                    xtype: 'button',
                                    text: 'Add New',
                                    iconCls: 'addIcon'
                                },
                                {
                                    xtype: 'tbseparator'
                                },
                                {
                                    xtype: 'button',
                                    text: 'Remove',
                                    iconCls: 'removeIcon'
                                },
                                {
                                    xtype: 'tbfill'
                                },
                                {
                                    xtype: 'button',
                                    text: 'Refresh',
                                    iconCls: 'tableRefreshIcon',
                                    handler: function(){
                                            var store = Ext.getStore('employeeStore');
                                            store.load(function(records, operation, success) {
                                                console.log('Employee created and loaded in list.');
                                            });
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }
});