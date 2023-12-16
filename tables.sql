use bugtrackingsystem;

create table sysuser (
	user_id varchar(10) not null,
    user_name varchar(100) not null,
    user_email varchar(100) not null,
    user_type enum('developer', 'tester', 'projectmanager') not null,
    primary key (user_id, user_email),
    index(user_email)
);
describe sysuser; drop table sysuser;

create table credentials (
	cred_email varchar(100) not null,
    cred_password varchar(100) not null,
	lastLoggedIn datetime not null,
	lastLoggedOut datetime not null,
    primary key (cred_email),
    foreign key (cred_email) references sysuser (user_email) on delete cascade
);
describe credentials; drop table credentials;

create table team (
	team_id integer not null,
    team_name varchar(100) not null,
    pmo_id varchar(10) not null,
	tester_id varchar(10) not null,
    dev_ids json not null,
    primary key (team_id),
    foreign key (pmo_id) references sysuser (user_id) on delete cascade,
    foreign key (tester_id) references sysuser (user_id) on delete cascade
--    foreign key (dev_ids) references sysuser (user_id) on delete cascade
);
describe team; drop table team;

create table project (
	project_id varchar(10) not null,
    project_name varchar(100) not null,
	proj_desc varchar(1000) not null,
	startDate datetime not null,
	proj_status enum('inprogress','completed'),
	team_ids json not null,
    primary key (project_id, project_name)
);
describe project; drop table project;

create table bugs (
	bug_id varchar(10) not null,
	title varchar(100) not null,
	bug_desc varchar(1000) not null,
	project_name varchar(100) not null,
	created_by varchar(100) not null,
	openDate datetime not null,
	assigned_to varchar(100) not null,
	markedForClosing boolean not null,
	closeDate datetime not null,
	closed_by varchar(100) not null,
	bug_status enum('inprogress','completed'),
	severity_level enum('critical','major','minor','trivial'),
    primary key (bug_id),
    foreign key (project_name) references project (project_name) on delete cascade
);
describe bugs; drop table bugs;