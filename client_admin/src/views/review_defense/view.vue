<template>
	<el-main class="bg edit_wrap">
		<el-form ref="form" :model="form" status-icon label-width="120px" v-if="is_view()">

							<el-col v-if="user_group === '管理员' || $check_field('get','student_information') || $check_field('add','student_information') || $check_field('set','student_information')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="学生信息" prop="student_information">
													<el-select v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','student_information')) || (!form['review_defense_id'] && $check_field('add','student_information'))" id="student_information" v-model="form['student_information']" :disabled="disabledObj['student_information_isDisabled']">
							<el-option v-for="o in list_user_student_information" :key="o['username']" :label="o['nickname'] + '-' + o['username']"
									   :value="o['user_id']">
							</el-option>
						</el-select>
						<el-select v-else-if="$check_field('get','student_information')" id="student_information" v-model="form['student_information']" :disabled="true">
							<el-option v-for="o in list_user_student_information" :key="o['username']" :label="o['nickname'] + '-' + o['username']"
									   :value="o['user_id']">
							</el-option>
						</el-select>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','student_id') || $check_field('add','student_id') || $check_field('set','student_id')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="学生学号" prop="student_id">
												<el-input id="student_id" v-model="form['student_id']" placeholder="请输入学生学号"
							  v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','student_id')) || (!form['review_defense_id'] && $check_field('add','student_id'))" :disabled="disabledObj['student_id_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','student_id')">{{form['student_id']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','student_name') || $check_field('add','student_name') || $check_field('set','student_name')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="学生姓名" prop="student_name">
												<el-input id="student_name" v-model="form['student_name']" placeholder="请输入学生姓名"
							  v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','student_name')) || (!form['review_defense_id'] && $check_field('add','student_name'))" :disabled="disabledObj['student_name_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','student_name')">{{form['student_name']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','class_name') || $check_field('add','class_name') || $check_field('set','class_name')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="班级名称" prop="class_name">
												<el-input id="class_name" v-model="form['class_name']" placeholder="请输入班级名称"
							  v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','class_name')) || (!form['review_defense_id'] && $check_field('add','class_name'))" :disabled="disabledObj['class_name_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','class_name')">{{form['class_name']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','thesis_title') || $check_field('add','thesis_title') || $check_field('set','thesis_title')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="论文题目" prop="thesis_title">
												<el-input id="thesis_title" v-model="form['thesis_title']" placeholder="请输入论文题目"
							  v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','thesis_title')) || (!form['review_defense_id'] && $check_field('add','thesis_title'))" :disabled="disabledObj['thesis_title_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','thesis_title')">{{form['thesis_title']}}</div>
											</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','date_of_reply') || $check_field('add','date_of_reply') || $check_field('set','date_of_reply')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="答辩日期" prop="date_of_reply">
								<el-date-picker :disabled="disabledObj['date_of_reply_isDisabled']" v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','date_of_reply')) || (!form['review_defense_id'] && $check_field('add','date_of_reply'))" id="date_of_reply"
						v-model="form['date_of_reply']" type="datetime" placeholder="选择日期时间">
					</el-date-picker>
					<div v-else-if="$check_field('get','date_of_reply')">{{form['date_of_reply']}}</div>
							</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','assessor') || $check_field('add','assessor') || $check_field('set','assessor')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="评审人员" prop="assessor">
								<el-input type="textarea" id="assessor" v-model="form['assessor']" placeholder="请输入评审人员"
						v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','assessor')) || (!form['review_defense_id'] && $check_field('add','assessor'))" :disabled="disabledObj['assessor_isDisabled']"></el-input>
					<div v-else-if="$check_field('get','assessor')">{{form['assessor']}}</div>
							</el-form-item>
			</el-col>
								<el-col v-if="user_group === '管理员' || $check_field('get','defense') || $check_field('add','defense') || $check_field('set','defense')" :xs="24" :sm="12" :lg="8" class="el_form_item_warp">
				<el-form-item label="答辩情况" prop="defense">
								<el-select id="defense" v-model="form['defense']"
						v-if="user_group === '管理员' || (form['review_defense_id'] && $check_field('set','defense')) || (!form['review_defense_id'] && $check_field('add','defense'))">
						<el-option v-for="o in list_defense" :key="o" :label="o" :value="o">
						</el-option>
					</el-select>
					<div v-else-if="$check_field('get','defense')">{{form['defense']}}</div>
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
				field: "review_defense_id",
				url_add: "~/api/review_defense/add?",
				url_set: "~/api/review_defense/set?",
				url_get_obj: "~/api/review_defense/get_obj?",
				url_upload: "~/api/review_defense/upload?",

				query: {
					"review_defense_id": 0,
				},

				form: {
								"student_information": 0, // 学生信息
										"student_id":  '', // 学生学号
										"student_name":  '', // 学生姓名
										"class_name":  '', // 班级名称
										"thesis_title":  '', // 论文题目
										"date_of_reply":  '', // 答辩日期
										"assessor":  '', // 评审人员
										"defense":  '', // 答辩情况
											"review_defense_id": 0, // ID
						
				},
				disabledObj:{
								"student_information_isDisabled": false,
										"student_id_isDisabled": false,
										"student_name_isDisabled": false,
										"class_name_isDisabled": false,
										"thesis_title_isDisabled": false,
										"date_of_reply_isDisabled": false,
										"assessor_isDisabled": false,
										"defense_isDisabled": false,
										},

	
					// 用户列表
				list_user_student_information: [],
				
		
		
		
		
		
						// 答辩情况选项列表
				list_defense: ['未进行','通过','未通过'],
	
	
			}
		},
		methods: {


	
	
				/**
			 * 获取学生用户用户列表
			 */
			async get_list_user_student_information() {
                // if(this.user_group !== "管理员" && this.form["student_information"] === 0) {
                //     this.form["student_information"] = this.user.user_id;
                // }
                var json = await this.$get("~/api/user/get_list?user_group=学生用户");
                if(json.result && json.result.list){
                    this.list_user_student_information = json.result.list;
                }
                else if(json.error){
                    console.error(json.error);
                }
			},
					get_user_student_information(id){
				var obj = this.list_user_student_information.getObj({"user_id":id});
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
																						// 获取缓存数据附加
				form = $.db.get("form");
							$.push(this.form ,form);
										
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
											        if (this.form["date_of_reply"].indexOf("-")===-1){
            this.form["date_of_reply"] = this.$toTime(parseInt(this.form["date_of_reply"]),"yyyy-MM-dd hh:mm:ss")
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


																        if(this.form["date_of_reply"]=="0000-00-00 00:00:00"){
          this.form["date_of_reply"] = null;
        }
				if(parseInt(this.form["date_of_reply"]) > 9999){
					this.form["date_of_reply"] = this.$toTime(parseInt(this.form["date_of_reply"]),"yyyy-MM-dd hh:mm:ss")
				}
									

			},


			is_view(){
				var bl = this.user_group == "管理员";

				if(!bl){
					bl = this.$check_action('/review_defense/table','add');
					console.log(bl ? "你有表格添加权限视作有添加权限" : "你没有表格添加权限");
				}
				if(!bl){
					bl = this.$check_action('/review_defense/table','set');
					console.log(bl ? "你有表格添加权限视作有修改权限" : "你没有表格修改权限");
				}
				if(!bl){
					bl = this.$check_action('/review_defense/view','add');
					console.log(bl ? "你有视图添加权限视作有添加权限" : "你没有视图添加权限");
				}
				if(!bl){
					bl = this.$check_action('/review_defense/view','set');
					console.log(bl ? "你有视图修改权限视作有修改权限" : "你没有视图修改权限");
				}
				if(!bl){
					bl = this.$check_action('/review_defense/view','get');
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
					this.get_list_user_student_information();
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
