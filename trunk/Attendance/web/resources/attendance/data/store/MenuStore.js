Ext.define('Attendance.data.store.MenuStore',{
    extend: 'Ext.data.TreeStore',
    
    
                root: {
                    text:'Menu',
                    expanded: true,
                    iconCls: 'folderIcon',
                    children:[{
                        text:'Setup',
                        expanded:false,
                        iconCls: 'folderIcon',
                        children:[
                            { id: '1', text:'Timing Definition', iconCls:'settingIcon', leaf:true },
                            { id: '2', text:'Create Designation', iconCls:'bookIcon', leaf:true },
                            { id: '3', text:'Create Workstation', iconCls:'monitorIcon', leaf:true },
                            { id: '4', text:'Create Employee', iconCls:'userIcon', leaf:true }
                        ]
                    },
                    {
                        text:'Time Management',
                        expanded:true,
                        iconCls: 'folderIcon',
                        children:[
                            { id: '5', text:'Time In', iconCls:'timeInIcon', leaf:true },
                            { id: '6', text:'Time Out', iconCls:'timeOutIcon', leaf:true },
                            { id: '7', text:'Reason', iconCls:'notepadIcon', leaf:true }
                        ]
                    },
                    {
                        text:'Reports',
                        expanded:false,
                        iconCls: 'folderIcon',
                        children:[
                            { id: '8', text:'Monthly Report', iconCls:'user-girl', leaf:true }
                        ]
                    }]
                
                }
});