<template>
	<el-main class="bg edit_wrap">
		<el-form ref="form" :model="form" status-icon label-width="120px" v-if="is_view()">

							<el-col v-if="user_group === '管理员' || $check_field('get','tutor_information') || $check_field('add','tutor_information') || $check_field('set','tutor_information')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="导师信息" prop="tutor_information">
																		<div v-if="user_group !== '管理员'">
							{{ get_user_session_tutor_information(form['tutor_information']) }}
							<!--<el-input id="business_name" v-model="form['tutor_information']" placeholder="请输入导师信息"-->
							<!--v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','tutor_information')) || (!form['thesis_title_id'] && $check_field('add','tutor_information'))" :disabled="disabledObj['tutor_information_isDisabled']"></el-input>-->
							<!--<div v-else-if="$check_field('get','tutor_information')">{{form['tutor_information']}}</div>-->
							<el-select v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','tutor_information')) || (!form['thesis_title_id'] && $check_field('add','tutor_information'))" id="tutor_information" v-model="form['tutor_information']" :disabled="disabledObj['tutor_information_isDisabled']">
								<el-option v-for="o in list_user_tutor_information" :key="o['username']" :label="o['nickname'] + '-' + o['username']"
										   :value="o['user_id']">
								</el-option>
							</el-select>
							<el-select v-else-if="$check_field('get','tutor_information')" id="tutor_information" v-model="form['tutor_information']" :disabled="true">
								<el-option v-for="o in list_user_tutor_information" :key="o['username']" :label="o['nickname'] + '-' + o['username']"
										   :value="o['user_id']">
								</el-option>
							</el-select>
						</div>
						<el-select v-else id="tutor_information" v-model="form['tutor_information']" :disabled="disabledObj['tutor_information_isDisabled']">
							<el-option v-for="o in list_user_tutor_information" :key="o['username']" :label="o['nickname'] + '-' + o['username']"
									   :value="o['user_id']">
							</el-option>
						</el-select>
																</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','tutor_id') || $check_field('add','tutor_id') || $check_field('set','tutor_id')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="导师工号" prop="tutor_id">
												<el-input id="tutor_id" v-model="form['tutor_id']" placeholder="请输入导师工号"
							  v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','tutor_id')) || (!form['thesis_title_id'] && $check_field('add','tutor_id'))" :disabled="disabledObj['tutor_id_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','tutor_id')">{{form['tutor_id']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','tutor_name') || $check_field('add','tutor_name') || $check_field('set','tutor_name')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="导师姓名" prop="tutor_name">
												<el-input id="tutor_name" v-model="form['tutor_name']" placeholder="请输入导师姓名"
							  v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','tutor_name')) || (!form['thesis_title_id'] && $check_field('add','tutor_name'))" :disabled="disabledObj['tutor_name_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','tutor_name')">{{form['tutor_name']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','thesis_title') || $check_field('add','thesis_title') || $check_field('set','thesis_title')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="论文题目" prop="thesis_title">
												<el-input id="thesis_title" v-model="form['thesis_title']" placeholder="请输入论文题目"
							  v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','thesis_title')) || (!form['thesis_title_id'] && $check_field('add','thesis_title'))" :disabled="disabledObj['thesis_title_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','thesis_title')">{{form['thesis_title']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','closing_date') || $check_field('add','closing_date') || $check_field('set','closing_date')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="截止日期" prop="closing_date">
								<el-date-picker :disabled="disabledObj['closing_date_isDisabled']" v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','closing_date')) || (!form['thesis_title_id'] && $check_field('add','closing_date'))" id="closing_date"
						v-model="form['closing_date']" type="date" placeholder="选择日期">
					</el-date-picker>
					<div v-else-if="$check_field('get','closing_date')">{{form['closing_date']}}</div>
							</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','thesis_requirements') || $check_field('add','thesis_requirements') || $check_field('set','thesis_requirements')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="论文要求" prop="thesis_requirements">
								<el-input type="textarea" id="thesis_requirements" v-model="form['thesis_requirements']" placeholder="请输入论文要求"
						v-if="user_group === '管理员' || (form['thesis_title_id'] && $check_field('set','thesis_requirements')) || (!form['thesis_title_id'] && $check_field('add','thesis_requirements'))" :disabled="disabledObj['thesis_requirements_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','thesis_requirements')">{{form['thesis_requirements']}}</div>
							</el-form-item>
			</el-col>
					
	
	
	
	
	
	
			<el-col :xs="24" :sm="12" :lg="8" class="el_form_btn_warp">
				<el-form-item>
					<el-button type="primary" @click="submit()">提交</el-button>
					<el-button @click="cancel()">取消</el-button>
				</el-form-item>
			</el-col>

		</el-form>
	</el-main>
</template>

<script>
	import mixin from "@/mixins/page.js";

	export default {
		mixins: [mixin],
		data() {
			return {
				field: "thesis_title_id",
				url_add: "~/api/thesis_title/add?",
				url_set: "~/api/thesis_title/set?",
				url_get_obj: "~/api/thesis_title/get_obj?",
				url_upload: "~/api/thesis_title/upload?",

				query: {
					"thesis_title_id": 0,
				},

				form: {
								"tutor_information": 0, // 导师信息
										"tutor_id":  '', // 导师工号
										"tutor_name":  '', // 导师姓名
										"thesis_title":  '', // 论文题目
										"closing_date":  '', // 截止日期
										"thesis_requirements":  '', // 论文要求
											"thesis_title_id": 0, // ID
						
				},
				disabledObj:{
								"tutor_information_isDisabled": false,
										"tutor_id_isDisabled": false,
										"tutor_name_isDisabled": false,
										"thesis_title_isDisabled": false,
										"closing_date_isDisabled": false,
										"thesis_requirements_isDisabled": false,
										},

	
					// 用户列表
				list_user_tutor_information: [],
						// 用户组
				group_user_tutor_information: "",
				
		
		
		
		
	
			}
		},
		methods: {


	
	
				/**
			 * 获取导师用户用户列表
			 */
			async get_list_user_tutor_information() {
                // if(this.user_group !== "管理员" && this.form["tutor_information"] === 0) {
                //     this.form["tutor_information"] = this.user.user_id;
                // }
                var json = await this.$get("~/api/user/get_list?user_group=导师用户");
                if(json.result && json.result.list){
                    this.list_user_tutor_information = json.result.list;
                }
                else if(json.error){
                    console.error(json.error);
                }
			},
					/**
			 * 获取导师用户用户组
			 */
			async get_group_user_tutor_information() {
							this.form["tutor_information"] = this.user.user_id;
							var json = await this.$get("~/api/user_group/get_obj?name=导师用户");
				if(json.result && json.result.obj){
					this.group_user_tutor_information = json.result.obj;
				}
				else if(json.error){
					console.error(json.error);
				}
			},
			get_user_session_tutor_information(id){
				var _this = this;
				var user_id = {"user_id":id}
				var url = "~/api/"+_this.group_user_tutor_information.source_table+"/get_obj?"
				this.$get(url, user_id, function(res) {
					if (res.result && res.result.obj) {
						var arr = []
						for (let key in res.result.obj) {
							arr.push(key)
						}
						var arrForm = []
									for (let key in _this.form) {
							arrForm.push(key)
						}
												_this.form["tutor_information"] = id
									_this.disabledObj['tutor_information' + '_isDisabled'] = true
						for (var i=0;i<arr.length;i++){
						  if (arr[i]!=='examine_state' && arr[i]!=='examine_reply') {
							for (var j = 0; j < arrForm.length; j++) {
							  if (arr[i] === arrForm[j]) {
								if (arr[i] !== "tutor_information") {
			                      _this.form[arrForm[j]] = res.result.obj[arr[i]]
			                      _this.disabledObj[arrForm[j] + '_isDisabled'] = true
								  break;
								} else {
								  _this.disabledObj[arrForm[j] + '_isDisabled'] = true
								}
							  }
							}
						  }
						}
					}
				});
			},
					get_user_tutor_information(id){
				var obj = this.list_user_tutor_information.getObj({"user_id":id});
				var ret = "";
				if(obj){
					if(obj.nickname){
						ret = obj.nickname;}
					else{
						ret = obj.username;
					}
				}
				return ret;
			},
			
	
			
	
			
	
			
	
			
	
		
			/**
			 * 获取对象之前
			 * @param {Object} param
			 */
			get_obj_before(param) {
				var form = "";
																							
				if(this.form && form){
					Object.keys(this.form).forEach(key => {
						Object.keys(form).forEach(dbKey => {
							// if(dbKey === "charging_standard"){
							// 	this.form['charging_rules'] = form[dbKey];
							// 	this.disabledObj['charging_rules_isDisabled'] = true;
							// };
							if(key === dbKey){
								this.disabledObj[key+'_isDisabled'] = true;
							}
						})
					})
				}
										        if (this.form["closing_date"].indexOf("-")===-1){
          this.form["closing_date"] = this.$toTime(parseInt(this.form["closing_date"]),"yyyy-MM-dd")
        }
							$.db.del("form");
				return param;
			},

			/**
			 * 获取对象之后
			 * @param {Object} json
			 * @param {Object} func
			 */
			get_obj_after(json, func){


														        if(this.form["closing_date"]=="0000-00-00"){
          this.form["closing_date"] = null;
        }
				if(parseInt(this.form["closing_date"]) > 9999){
					this.form["closing_date"] = this.$toTime(parseInt(this.form["closing_date"]),"yyyy-MM-dd")
				}
					

			},


			is_view(){
				var bl = this.user_group == "管理员";

				if(!bl){
					bl = this.$check_action('/thesis_title/table','add');
					console.log(bl ? "你有表格添加权限视作有添加权限" : "你没有表格添加权限");
				}
				if(!bl){
					bl = this.$check_action('/thesis_title/table','set');
					console.log(bl ? "你有表格添加权限视作有修改权限" : "你没有表格修改权限");
				}
				if(!bl){
					bl = this.$check_action('/thesis_title/view','add');
					console.log(bl ? "你有视图添加权限视作有添加权限" : "你没有视图添加权限");
				}
				if(!bl){
					bl = this.$check_action('/thesis_title/view','set');
					console.log(bl ? "你有视图修改权限视作有修改权限" : "你没有视图修改权限");
				}
				if(!bl){
					bl = this.$check_action('/thesis_title/view','get');
					console.log(bl ? "你有视图查询权限视作有查询权限" : "你没有视图查询权限");
				}

				console.log(bl ? "具有当前页面的查看权，请注意这不代表你有字段的查看权" : "无权查看当前页，请注意即便有字段查询权限没有页面查询权限也不行");

				return bl;
			},
			/**
			 * 上传文件
			 * @param {Object} param
			 */
			uploadimg(param) {
				this.uploadFile(param.file, "avatar");
			},

		},
		created() {
					this.get_list_user_tutor_information();
					this.get_group_user_tutor_information();
															},
	}
</script>

<style>
	.avatar-uploader .el-upload {
		border: 1px dashed #d9d9d9;
		border-radius: 6px;
		cursor: pointer;
		position: relative;
		overflow: hidden;
	}

	.avatar-uploader .el-upload:hover {
		border-color: #409EFF;
	}

	.avatar-uploader-icon {
		font-size: 28px;
		color: #8c939d;
		width: 178px;
		height: 178px;
		line-height: 178px;
		text-align: center;
	}

	.avatar {
		width: 178px;
		height: 178px;
		display: block;
	}




</style>
