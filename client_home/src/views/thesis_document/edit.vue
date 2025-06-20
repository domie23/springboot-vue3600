<template>
	<div class="diy_edit page_thesis_document" id="thesis_document_edit">
		<div class='warp'>
			<div class='container'>
				<div class='row diy_edit_content_box'>
						<div v-if="$check_field('set','student_information') || $check_field('add','student_information') || $check_field('get','student_information')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								学生信息:
							</span>
						</div>
						<div class="diy_field diy_down">
							<select id="form_student_information" :disabled="disabledObj['student_information_isDisabled']" v-model="form['student_information']" v-if="(form['student_information'] && $check_field('set','student_information')) || (!form['student_information'] && $check_field('add','student_information'))" >
								<option v-for="o in list_user_student_information" :value="o['user_id']">
									{{o['nickname'] + '-' + o['username']}}
								</option>
							</select>
							<span v-else-if="$check_field('get','student_information')">{{ form['student_information'] }}</span>
						</div>
					</div>
							<div v-if="$check_field('set','student_id') || $check_field('add','student_id') || $check_field('get','student_id')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								学生学号:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_student_id" v-model="form['student_id']" placeholder="请输入学生学号" v-if="(form['student_id'] && $check_field('set','student_id')) || (!form['student_id'] && $check_field('add','student_id'))"  :disabled="disabledObj['student_id_isDisabled']"/>
							<span v-else-if="$check_field('get','student_id')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','student_name') || $check_field('add','student_name') || $check_field('get','student_name')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								学生姓名:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_student_name" v-model="form['student_name']" placeholder="请输入学生姓名" v-if="(form['student_name'] && $check_field('set','student_name')) || (!form['student_name'] && $check_field('add','student_name'))"  :disabled="disabledObj['student_name_isDisabled']"/>
							<span v-else-if="$check_field('get','student_name')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','class_name') || $check_field('add','class_name') || $check_field('get','class_name')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								班级名称:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_class_name" v-model="form['class_name']" placeholder="请输入班级名称" v-if="(form['class_name'] && $check_field('set','class_name')) || (!form['class_name'] && $check_field('add','class_name'))"  :disabled="disabledObj['class_name_isDisabled']"/>
							<span v-else-if="$check_field('get','class_name')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','tutor_information') || $check_field('add','tutor_information') || $check_field('get','tutor_information')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								导师信息:
							</span>
						</div>
						<div class="diy_field diy_down">
							<select id="form_tutor_information" :disabled="disabledObj['tutor_information_isDisabled']" v-model="form['tutor_information']" v-if="(form['tutor_information'] && $check_field('set','tutor_information')) || (!form['tutor_information'] && $check_field('add','tutor_information'))" >
								<option v-for="o in list_user_tutor_information" :value="o['user_id']">
									{{o['nickname'] + '-' + o['username']}}
								</option>
							</select>
							<span v-else-if="$check_field('get','tutor_information')">{{ form['tutor_information'] }}</span>
						</div>
					</div>
							<div v-if="$check_field('set','tutor_id') || $check_field('add','tutor_id') || $check_field('get','tutor_id')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								导师工号:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_tutor_id" v-model="form['tutor_id']" placeholder="请输入导师工号" v-if="(form['tutor_id'] && $check_field('set','tutor_id')) || (!form['tutor_id'] && $check_field('add','tutor_id'))"  :disabled="disabledObj['tutor_id_isDisabled']"/>
							<span v-else-if="$check_field('get','tutor_id')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','tutor_name') || $check_field('add','tutor_name') || $check_field('get','tutor_name')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								导师姓名:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_tutor_name" v-model="form['tutor_name']" placeholder="请输入导师姓名" v-if="(form['tutor_name'] && $check_field('set','tutor_name')) || (!form['tutor_name'] && $check_field('add','tutor_name'))"  :disabled="disabledObj['tutor_name_isDisabled']"/>
							<span v-else-if="$check_field('get','tutor_name')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','thesis_title') || $check_field('add','thesis_title') || $check_field('get','thesis_title')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								论文题目:
							</span>
						</div>
								<!-- 文本 -->
									<div class="diy_field diy_text">
							<input type="text" id="form_thesis_title" v-model="form['thesis_title']" placeholder="请输入论文题目" v-if="(form['thesis_title'] && $check_field('set','thesis_title')) || (!form['thesis_title'] && $check_field('add','thesis_title'))"  :disabled="disabledObj['thesis_title_isDisabled']"/>
							<span v-else-if="$check_field('get','thesis_title')">{{ form['${obj.name}'] }}</span>
						</div>
										</div>
							<div v-if="$check_field('set','document_type') || $check_field('add','document_type') || $check_field('get','document_type')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								文档类型:
							</span>
						</div>
								<!-- 选项 -->
						<div class="diy_field diy_down">
							<select id="form_document_type" v-model="form['document_type']" v-if="(form['document_type'] && $check_field('set','document_type')) || (!form['document_type'] && $check_field('add','document_type'))" >
								<option v-for="o in list_document_type" :value="o">
									{{o}}
								</option>
							</select>
							<span v-else-if="$check_field('get','document_type')">{{ form['document_type'] }}</span>
						</div>
							</div>
							<div v-if="$check_field('set','upload_document') || $check_field('add','upload_document') || $check_field('get','upload_document')" class="form-item col-12 col-md-6">
						<div class="diy_title">
							<span>
								上传文档:
							</span>
						</div>
								<!-- 文件 -->
						<input type="file" style="display: none;" id="form_file_upload_document" title="upload_document" @change="change_file($event.target.files,'upload_document')"/>
						<!-- 修改权限 -->
						<div class="diy_field diy_img" v-if="form['upload_document'] && $check_field('set','upload_document')">
							<label for="form_file_upload_document">
								<!--<span>{{form['upload_document']}} </span>-->
								<a :href="$fullUrl(form['upload_document'])" target="_blank" style="color: rgb(64, 158, 255);">点击下载</a>
							</label>
						</div>
						<!-- 添加权限 -->
						<div class="diy_field diy_img" v-else-if="!form['upload_document'] && $check_field('add','upload_document')">
							<label for="form_file_upload_document">
								<div class="btn_add_img">
									<span>+</span>
								</div>
							</label>
						</div>
						<!-- 查询权限 -->
						<div class="diy_field diy_img" v-else-if="$check_field('get','upload_document')">
							<span>{{form['upload_document']}} </span>
						</div>
							</div>
	




				</div>
				<div class="diy_edit_submit_box row">
					<div class="col-12">
						<div class="btn_box">
							<button class="btn_submit" @click="submit()">提交</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>

<script>
	import mixin from "@/mixins/page.js";
	export default {
		mixins: [mixin],
		components: {},
		data() {
			return {
				url_get_obj: "~/api/thesis_document/get_obj?",
				url_add: "~/api/thesis_document/add?",
				url_set: "~/api/thesis_document/set?",

				// 登录权限
				oauth: {
					"signIn": true,
					"user_group": []
				},

				// 查询条件
				query: {
						"student_information": 0,
							"student_id": "",
							"student_name": "",
							"class_name": "",
							"tutor_information": 0,
							"tutor_id": "",
							"tutor_name": "",
							"thesis_title": "",
							"document_type": "",
							"upload_document": "",
						"thesis_document_id": 0,
				},

				obj: {
						"student_information": 0, // 学生信息
							"student_id":  '', // 学生学号
							"student_name":  '', // 学生姓名
							"class_name":  '', // 班级名称
							"tutor_information": 0, // 导师信息
							"tutor_id":  '', // 导师工号
							"tutor_name":  '', // 导师姓名
							"thesis_title":  '', // 论文题目
							"document_type":  '', // 文档类型
							"upload_document":  '', // 上传文档
						"thesis_document_id": 0,
				},

				// 表单字段
				form: {
						"student_information": 0, // 学生信息
							"student_id":  '', // 学生学号
							"student_name":  '', // 学生姓名
							"class_name":  '', // 班级名称
							"tutor_information": 0, // 导师信息
							"tutor_id":  '', // 导师工号
							"tutor_name":  '', // 导师姓名
							"thesis_title":  '', // 论文题目
							"document_type":  '', // 文档类型
							"upload_document":  '', // 上传文档
						"thesis_document_id": 0,
				},
				disabledObj:{
						"student_information_isDisabled": false,
							"student_id_isDisabled": false,
							"student_name_isDisabled": false,
							"class_name_isDisabled": false,
							"tutor_information_isDisabled": false,
							"tutor_id_isDisabled": false,
							"tutor_name_isDisabled": false,
							"thesis_title_isDisabled": false,
							"document_type_isDisabled": false,
							"upload_document_isDisabled": false,
					},

						// 用户列表
				list_user_student_information: [],
													// 用户列表
				list_user_tutor_information: [],
												// 文档类型选项列表
				list_document_type: ['任务书','一稿','二稿'],
				
				// ID字段
				field: "thesis_document_id",

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
					async get_user_session_student_information(){
				var _this = this;
				var json = await this.$get("~/api/user_group/get_obj?name=学生用户");
				if(json.result && json.result.obj){
					var source_table = json.result.obj.source_table;
					var user_id = _this.$store.state.user.user_id;
					if (user_id){
						var url = "~/api/"+source_table+"/get_obj?"
						this.$get(url, {"user_id":_this.$store.state.user.user_id}, function(res) {
							if (res.result && res.result.obj) {
								var arr = []
								for (let key in res.result.obj) {
									arr.push(key)
								}
								var arrForm = []
								for (let key in _this.form) {
									arrForm.push(key)
								}
								_this.form["student_information"] = user_id
								_this.disabledObj['student_information' + '_isDisabled'] = true
								for (var i=0;i<arr.length;i++){
                  if (arr[i]!=='examine_state' && arr[i]!=='examine_reply') {
                    for (var j = 0; j < arrForm.length; j++) {
                      if (arr[i] === arrForm[j]) {
                        if (arr[i] !== "student_information") {
                          _this.form[arrForm[j]] = res.result.obj[arr[i]]
                          _this.disabledObj[arrForm[j] + '_isDisabled'] = true
                          break;
                        }
                      }
                    }
                  }
								}
							}
						});
					}
				}
				else if(json.error){
					console.error(json.error);
				}
			},
	
				
				
				
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
			 * 修改文件
			 * @param { Object } files 上传文件对象
			 * @param { String } str 表单的属性名
			 */
			change_file(files, str) {
				var form = new FormData();
				form.append("file", files[0]);
				this.$post("~/api/thesis_document/upload?", form, (res) => {
					if (res.result) {
						this.form[str] = res.result.url;
					} else if (res.error) {
						this.$toast(res.error.message);
					}
				});
			},

			/**
			 * 获取对象后获取缓存表单
			 * @param {Object} json
			 * @param {Object} func
			 */
			get_obj_before(param){
				var form = $.db.get("form");
				// if (form) {
        //   delete(form.examine_state)
        //   delete(form.examine_reply)
        //   this.obj = $.push(this.obj ,form);
				// 	this.form = $.push(this.form ,form);
				// }
				// var arr = []
				// for (let key in form) {
				// 	arr.push(key)
				// }
				// for (var i=0;i<arr.length;i++){
				// 	this.disabledObj[arr[i] + '_isDisabled'] = true
				// }
        if (form) {
          var arr = []
          for (let key in form) {
            arr.push(key)
          }
          var arrForm = []
          for (let key in this.form) {
            arrForm.push(key)
          }
          for (var i=0;i<arr.length;i++){
            if (arr[i]!=='examine_state' && arr[i]!=='examine_reply') {
              for (var j = 0; j < arrForm.length; j++) {
                if (arrForm[j] === arr[i]) {
                  this.form[arrForm[j]] = form[arr[i]]
                  this.obj[arrForm[j]] = form[arr[i]]
                  this.disabledObj[arrForm[j] + '_isDisabled'] = true
                  break;
                }
              }
            }
          }
        }
																				
        $.db.del("form");
				return param;
			},

			/**
			 * 获取对象后获取缓存表单
			 * @param {Object} json
			 * @param {Object} func
			 */
			get_obj_after(json ,func){
				// var form = $.db.get("form");
				// var obj = Object.assign({} ,form ,this.obj);
				// if (obj) {
        //   delete(obj.examine_state)
        //   delete(obj.examine_reply)
				// 	this.obj = $.push(this.obj ,obj);
				// }
				// if (form) {
        //   delete(form.examine_state)
        //   delete(form.examine_reply)
				// 	this.form = $.push(this.form ,form);
				// }
				if(func){
					func(json);
				}
			},

		},
		created() {
					this.get_user_session_student_information();
					this.get_list_user_student_information();
																this.get_list_user_tutor_information();
																		},
	}
</script>

<style>




</style>
